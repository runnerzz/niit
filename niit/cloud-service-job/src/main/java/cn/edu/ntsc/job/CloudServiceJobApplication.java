package cn.edu.ntsc.job;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
@MapperScan("cn.edu.ntsc.job.dao")
public class CloudServiceJobApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudServiceJobApplication.class, args);
	}
}	
