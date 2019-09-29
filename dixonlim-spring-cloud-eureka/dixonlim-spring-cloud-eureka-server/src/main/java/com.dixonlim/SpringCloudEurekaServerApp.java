package com.dixonlim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname com.dixonlim.SpringCloudEurekaServerApp
 * @Auther: DixonLim
 * @Date: 2019/9/29 13:04
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer //启动一个服务注册中心，只需要一个注解@EnableEurekaServer
public class SpringCloudEurekaServerApp {
    public static void main(String[] args) {
        SpringApplication.run( SpringCloudEurekaServerApp.class, args );
    }
}
