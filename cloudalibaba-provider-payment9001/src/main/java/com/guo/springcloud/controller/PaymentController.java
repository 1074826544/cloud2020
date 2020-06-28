package com.guo.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud2020
 * @description:
 * @author: guoli
 * @create: 2020-06-16 13:47
 **/
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    /**
    * @Description: nacos demo
    * @Author: gouli
    * @Date: 2020/6/16
    */
    @GetMapping(value = "/alibaba/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id)
    {
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }
}
