package com.zurnachyan.gadratgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GadratGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GadratGatewayApplication.class, args);
	}

}
