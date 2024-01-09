package com.zurnachyan.gadratgateway.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zurnachyan.gadratgateway.model.AuthValidationResponse;
import com.zurnachyan.gadratgateway.model.ExceptionResponseModel;
import com.zurnachyan.gadratgateway.util.SecurityConstants;
import com.zurnachyan.gadratgateway.validator.RouteValidator;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

@Slf4j
@Component
public class AuthenticationFilter extends AbstractGatewayFilterFactory<AuthenticationFilter.Config> {

    private final ObjectMapper objectMapper;
    private final RouteValidator routeValidator;

    public AuthenticationFilter(ObjectMapper objectMapper,
                                RouteValidator routeValidator) {
        super(Config.class);
        this.objectMapper = objectMapper;
        this.routeValidator = routeValidator;
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            ServerHttpRequest request = exchange.getRequest();
            if (routeValidator.isSecured.test(request)) {

                String bearerToken = request.getHeaders().getFirst(SecurityConstants.AUTH_HEADER);

                log.info("**************************************");
                log.info("Request URL is: " + request.getURI().getPath());

                if (StringUtils.isBlank(bearerToken)) {
                    throw new RuntimeException("Missing authorization header!");
                }

                log.info("Bearer token: " + bearerToken);

                return WebClient.builder().build().get()
                        .uri("lb://authentication-service/api/v1/validateToken")
                        .header(SecurityConstants.AUTH_HEADER, bearerToken)
                        .retrieve().bodyToMono(AuthValidationResponse.class)
                        .map(response -> {
                            exchange.getRequest().mutate().header("username", response.getUsername());
                            exchange.getRequest().mutate().header("authorities",
                                    response.getAuthorities().stream()
                                            .reduce("", (a, b) -> a + ", " + b));
                            return exchange;
                        })
                        .flatMap(chain::filter)
                        .onErrorResume(error -> {
                            log.error("Error happened!");
                            HttpStatusCode errorCode;
                            String errorMessage;

                            if (error instanceof WebClientResponseException exception) {
                                errorCode = exception.getStatusCode();
                                errorMessage = exception.getMessage();
                            } else {
                                errorCode = HttpStatus.BAD_GATEWAY;
                                errorMessage = HttpStatus.BAD_GATEWAY.getReasonPhrase();
                            }

                            return onError(exchange,
                                    String.valueOf(errorCode.value()),
                                    errorMessage,
                                    "JWT Authentication failed!",
                                    errorCode);
                        });
            }
            return chain.filter(exchange);
        };
    }

    private Mono<Void> onError(ServerWebExchange exchange, String errorCode,
                               String error, String errorDetails, HttpStatusCode httpStatus) {
        ServerHttpResponse response = exchange.getResponse();
        DataBufferFactory dataBufferFactory = response.bufferFactory();
        response.setStatusCode(httpStatus);
        try {
            response.getHeaders().add("Content-Type", "application/json");
            ExceptionResponseModel data = new ExceptionResponseModel(errorCode, error, errorDetails, new Date());
            byte[] byteData = objectMapper.writeValueAsBytes(data);
            return response.writeWith(Mono.just(byteData).map(dataBufferFactory::wrap));
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
        }
        return response.setComplete();
    }

    @NoArgsConstructor
    public static class Config {

    }

}
