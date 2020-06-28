package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description: Consul 启动类
 * @author: guoli
 * @create: 2020-06-13 00:54
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
    public static void main(String[] args) {
            SpringApplication.run(PaymentMain8006.class, args);
        }
}
