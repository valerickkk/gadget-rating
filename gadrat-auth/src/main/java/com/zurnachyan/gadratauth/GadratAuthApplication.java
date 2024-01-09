package com.zurnachyan.gadratauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GadratAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(GadratAuthApplication.class, args);
    }

}
