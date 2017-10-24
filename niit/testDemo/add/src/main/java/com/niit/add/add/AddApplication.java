package com.niit.add.add;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AddApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddApplication.class, args);
	}
}
