package com.practice.spring.microservices.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class SpringMicroservicesDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesDbServiceApplication.class, args);
	}

}
