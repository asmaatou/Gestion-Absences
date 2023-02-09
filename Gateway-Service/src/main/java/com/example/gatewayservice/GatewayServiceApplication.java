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
					.route(r -> r.path("/students/**").uri("lb://STUDENTS-SERVICE"))
					.route(r -> r.path("/professors/**").uri("lb://PROFESSORS-SERVICE"))
					.route(r -> r.path("/courses/**").uri("lb://COURSES-SERVICE"))
					.build();
	}




}
