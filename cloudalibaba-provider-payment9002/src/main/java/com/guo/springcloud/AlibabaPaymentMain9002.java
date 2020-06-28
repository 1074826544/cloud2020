package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description:
 * @author: guoli
 * @create: 2020-06-16 14:31
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPaymentMain9002 {
    public static void main(String[] args) {
            SpringApplication.run(AlibabaPaymentMain9002.class, args);
        }
}
