package com.niit.server_person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //客户端
public class ServerPersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerPersonApplication.class, args);
	}
}
