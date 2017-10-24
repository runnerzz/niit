package cn.edu.ntsc.car;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
@MapperScan("cn.edu.ntsc.car.dao")
public class CloudServiceCarApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(CloudServiceCarApplication.class, args);
	}
}	
