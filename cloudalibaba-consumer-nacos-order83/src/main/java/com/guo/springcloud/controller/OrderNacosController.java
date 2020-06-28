package com.guo.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2020
 * @description:
 * @author: guoli
 * @create: 2020-06-16 14:54
 **/
@RestController
@Slf4j
public class OrderNacosController {

    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        this.restTemplate = new RestTemplate();
        return restTemplate;
    }

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id)
    {
         System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+serverURL);
        restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
        return "MMMMMMMMMMMMMMM";
    }
}
