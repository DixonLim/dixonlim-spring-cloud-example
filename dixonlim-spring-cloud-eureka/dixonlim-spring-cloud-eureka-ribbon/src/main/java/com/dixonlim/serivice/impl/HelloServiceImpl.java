package com.dixonlim.serivice.impl;

import com.dixonlim.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname com.dixonlim.serivice.impl.HelloServiceImpl
 * @Auther: DixonLim
 * @Date: 2019/9/29 14:19
 * @Description:
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "msgError")
    public String sayHello(String msg) {
        return restTemplate.getForObject("http://EURKA-CLIENT/msg?msg="+msg,String.class);
    }

    public String msgError(String msg) {
        return "sorry,error! can no get "+msg;
    }
}
