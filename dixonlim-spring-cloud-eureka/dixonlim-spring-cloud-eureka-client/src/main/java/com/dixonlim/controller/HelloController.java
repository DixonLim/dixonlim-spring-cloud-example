package com.dixonlim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname com.dixonlim.controller.HelloController
 * @Auther: DixonLim
 * @Date: 2019/9/29 14:03
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private Environment environment;
    @RequestMapping("/msg")
    public String msg(@RequestParam(value = "msg", defaultValue = "Dixonlim") String msg) {
        return msg+" And port = "+environment.getProperty("server.port");
    }
}
