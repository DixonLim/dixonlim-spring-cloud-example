package com.dixonlim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Classname com.dixonlim.SpringCloudEurekaZuulApp
 * @Auther: DixonLim
 * @Date: 2019/9/29 16:07
 * @Description:
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringCloudEurekaZuulApp {
    public static void main(String[] args) {
        SpringApplication.run( SpringCloudEurekaZuulApp.class, args );
    }
}
