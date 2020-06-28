package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: cloud2020
 * @description: feign Hystrix 启动类
 * @author: guoli
 * @create: 2020-06-13 17:07
 **/
@SpringBootApplication
@EnableFeignClients
@EnableHystrix  //启动熔断降级服务
public class OrderHystrixMain80{

    public static void main(String[] args)
    {

        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}
