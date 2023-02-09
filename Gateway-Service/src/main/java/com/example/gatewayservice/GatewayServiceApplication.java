package com.example.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
	@Bean
	RouteLocator routage(RouteLocatorBuilder rlb){
		return  rlb.routes()
				.route(r -> r.path("/students/**").uri("http://localhost:8083/"))
				.route(r -> r.path("/professors/**").uri("http://localhost:8084/"))
				.route(r -> r.path("/courses/**").uri("http://localhost:8081/"))
				.build();
	}

}
