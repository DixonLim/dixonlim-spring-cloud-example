package com.dixonlim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: DixonLim
 * @Date: 2019/9/30 16:15
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RefreshScope
public class ConfigClientApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp.class, args);
    }
}
