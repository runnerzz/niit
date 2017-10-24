package cn.edu.ntsc.job.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(locations="classpath:application.yaml", prefix="spring.redis")
@Data
public class RedisProperties {
    private String host;
    private int port;
}