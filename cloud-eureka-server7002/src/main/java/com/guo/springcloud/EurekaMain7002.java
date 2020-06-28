package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: cloud2020
 * @description: EurekaMain7002 集群Eureka
 * @author: guoli
 * @create: 2020-06-11 22:34
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {

        SpringApplication.run(EurekaMain7002.class, args);
    }
}
