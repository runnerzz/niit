package com.niit.server_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //服务端
public class ServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerEurekaApplication.class, args);
	}
}
