package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: cloud2020
 * @description: config git
 * @author: guoli
 * @create: 2020-06-14 00:24
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {

        SpringApplication.run(ConfigCenterMain3344.class, args);
    }

}
