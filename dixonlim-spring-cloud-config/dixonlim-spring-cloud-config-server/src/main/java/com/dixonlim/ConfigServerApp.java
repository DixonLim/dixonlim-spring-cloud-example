package com.dixonlim;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: DixonLim
 * @Date: 2019/9/30 15:40
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient // 通过注解@EnableEurekaClient 表明自己是一个eureka client
public class ConfigServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp.class, args);
    }
}
