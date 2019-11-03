package com.funtl.spring.cloud.alibaba.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-provider")
public interface EchoService {
    @GetMapping("/echo/{string}")
    public String echo(@PathVariable("string") String string);

    @GetMapping(value = "/lb")
    public String lb();
}
