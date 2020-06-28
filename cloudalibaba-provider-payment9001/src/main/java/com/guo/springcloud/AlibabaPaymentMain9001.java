package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description: nacos
 * @author: guoli
 * @create: 2020-06-16 13:46
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPaymentMain9001 {
    public static void main(String[] args) {
               SpringApplication.run(AlibabaPaymentMain9001.class, args);
        }
}
