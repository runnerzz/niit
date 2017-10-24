package com.niit.niit_service_add;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //我需要被发现。我需要被治理
public class NiitServiceAddApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiitServiceAddApplication.class, args);
	}
}
