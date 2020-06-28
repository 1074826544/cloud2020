package com.guo.springcloud;

import com.guo.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration=MySelfRule.class)
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MySelfRule.class) //修改ribbon 策略随机
public class OrderMain80
{
    public static void main(String[] args) {

        SpringApplication.run(OrderMain80.class, args);
    }

}
