package com.dixonlim.service.hystrix;

import com.dixonlim.service.FeignHelloService;
import org.springframework.stereotype.Component;

/**
 * @Classname com.dixonlim.service.impl.FeignHelloServiceHystric
 * @Auther: DixonLim
 * @Date: 2019/9/29 15:43
 * @Description:
 */
@Component
public class FeignHelloServiceHystrix implements FeignHelloService {
    public String sayFeignHello(String msg) {
        return "sorry,error! can no get "+msg;
    }
}
