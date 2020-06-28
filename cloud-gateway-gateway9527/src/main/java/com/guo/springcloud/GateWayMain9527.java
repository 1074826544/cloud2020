package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @description: Gateway 启动类
 * @author: guoli
 * @create: 2020-06-13 21:58
 **/
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {

        SpringApplication.run(GateWayMain9527.class, args);
    }
}
