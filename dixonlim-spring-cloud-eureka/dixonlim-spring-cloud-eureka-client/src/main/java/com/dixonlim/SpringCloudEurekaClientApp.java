package com.dixonlim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname com.dixonlim.SpringCloudEurekaClientApp
 * @Auther: DixonLim
 * @Date: 2019/9/29 14:02
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient // 通过注解@EnableEurekaClient 表明自己是一个eureka client
public class SpringCloudEurekaClientApp {
    public static void main(String[] args) {
        SpringApplication.run( SpringCloudEurekaClientApp.class, args );
    }
}
