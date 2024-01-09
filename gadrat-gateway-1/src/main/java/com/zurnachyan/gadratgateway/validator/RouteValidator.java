package com.zurnachyan.gadratgateway.validator;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.function.Predicate;

@Component
public class RouteValidator {

    public static final Set<String> openApiRoutes = Set.of(
            "auth/register",
            "auth/authenticate"
    );

    public Predicate<ServerHttpRequest> isSecured = request -> openApiRoutes.stream()
            .noneMatch(uri -> request.getURI().getPath().contains(uri));
}