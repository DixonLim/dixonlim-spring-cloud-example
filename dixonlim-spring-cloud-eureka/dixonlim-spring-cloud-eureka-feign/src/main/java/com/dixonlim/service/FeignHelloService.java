package com.dixonlim.service;

import com.dixonlim.service.hystrix.FeignHelloServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname com.dixonlim.service.impl.FeignHelloServiceImpl
 * @Auther: DixonLim
 * @Date: 2019/9/29 15:22
 * @Description:
 */
@FeignClient(value = "EURKA-CLIENT",fallback = FeignHelloServiceHystrix.class ) // 指定调用哪个服务
public interface FeignHelloService {

    @RequestMapping(value = "/msg") // e.g. 调用了EURKA-CLIENT服务的“/msg”接口
    public String sayFeignHello(@RequestParam(value = "msg") String msg);
}
