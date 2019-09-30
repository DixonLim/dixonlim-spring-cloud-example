package com.dixonlim.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: DixonLim
 * @Date: 2019/9/30 16:16
 * @Description:
 */
@RestController
public class HelloController {

    @Value("${config.name}")
    String configName;

    @RequestMapping(value = "/hello")
    public String hello(){
        return configName;
    }
}
