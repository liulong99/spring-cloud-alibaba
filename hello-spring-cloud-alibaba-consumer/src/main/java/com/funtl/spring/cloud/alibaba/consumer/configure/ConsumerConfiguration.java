package com.funtl.spring.cloud.alibaba.consumer.configure;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerConfiguration {

    /**
     * 相当于在application.xml中<been id="restTemplate" class="org.springframework.web.client.RestTemplate"/>
     * @return
     */

    @Bean
    @LoadBalanced            //RestTemplate就具备了负载均衡功能
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
