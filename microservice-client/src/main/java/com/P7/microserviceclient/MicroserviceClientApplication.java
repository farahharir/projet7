package com.P7.microserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
//Permet d'activer Feign dans ce Microservice
@SpringBootApplication
@EnableFeignClients("com.P7.microserviceclient")
public class MicroserviceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceClientApplication.class, args);
	}

}
