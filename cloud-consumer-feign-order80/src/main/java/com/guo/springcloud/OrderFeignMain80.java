package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: cloud2020
 * @description: feign 启动类 demo
 * @author: guoli
 * @create: 2020-06-13 12:56
 **/
@SpringBootApplication
@EnableFeignClients  //激活并开启
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
