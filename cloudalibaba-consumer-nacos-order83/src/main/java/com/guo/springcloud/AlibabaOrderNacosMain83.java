package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description:
 * @author: guoli
 * @create: 2020-06-16 14:53
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaOrderNacosMain83 {
    public static void main(String[] args) {
            SpringApplication.run(AlibabaOrderNacosMain83.class, args);
        }
}
