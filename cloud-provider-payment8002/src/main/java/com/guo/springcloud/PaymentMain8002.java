package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
* @Param:
* @return: 
* @Author: gouli
* @Date: 2020/6/11
* @Description: 启动类
*/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8002
{
    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8002.class, args);
    }
}
