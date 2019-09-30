package com.dixonlim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname com.dixonlim.EurekaRibbonApp
 * @Auther: DixonLim
 * @Date: 2019/9/29 14:14
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient // 通过注解@EnableEurekaClient 表明自己是一个eureka client
@EnableDiscoveryClient // 通过@EnableDiscoveryClient向服务中心注册
@EnableHystrix // @EnableHystrix注解开启Hystrix
public class EurekaRibbonApp {
    public static void main(String[] args) {
        SpringApplication.run( EurekaRibbonApp.class, args );
    }

    /**
     * @Author DixonLim
     * @Date 2019/9/29 2:16 下午
     * @Param []
     * @Return org.springframework.web.client.RestTemplate
     * @Description: 向程序的ioc注入一个bean: restTemplate;并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
