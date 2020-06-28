package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @description:
 * @author: guoli
 * @create: 2020-06-15 12:08
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
    public static void main(String[] args) {
            SpringApplication.run(ConfigClientMain3355.class, args);
        }
}
