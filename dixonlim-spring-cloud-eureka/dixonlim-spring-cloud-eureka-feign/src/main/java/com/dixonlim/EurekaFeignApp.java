package com.dixonlim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Classname com.dixonlim.EurekaFeignApp
 * @Auther: DixonLim
 * @Date: 2019/9/29 15:11
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaFeignApp {
    public static void main(String[] args) {
        SpringApplication.run( EurekaFeignApp.class, args );
    }
}
