package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @program: cloud2020
 * @description: 仪表盘启动类
 * @author: guoli
 * @create: 2020-06-13 19:35
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
                SpringApplication.run(HystrixDashboardMain9001.class, args);
    }
}
