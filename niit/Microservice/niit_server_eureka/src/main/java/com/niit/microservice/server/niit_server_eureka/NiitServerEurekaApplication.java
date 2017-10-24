package com.niit.microservice.server.niit_server_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启动识别：我是治理服务
public class NiitServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NiitServerEurekaApplication.class, args);
    }
}
