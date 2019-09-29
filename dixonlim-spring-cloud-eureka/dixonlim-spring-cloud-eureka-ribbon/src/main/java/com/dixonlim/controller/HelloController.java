package com.dixonlim.controller;

import com.dixonlim.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private HelloService helloService;
    @RequestMapping("/msg")
    public String msg(@RequestParam(value = "msg", defaultValue = "Dixonlim") String msg) {
        return helloService.sayHello(msg) ;
    }
}
