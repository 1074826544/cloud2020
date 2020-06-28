package com.guo.springcloud.config;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2020
 * @description: RestTemplate 访问restful接口 配置
 * @author: guoli
 * @create: 2020-06-11 15:34
 **/
@Configurable
public class ApplicationContextConfig {

    @Bean //相当于 applicationContext.xml <bean id="" class="">
    @LoadBalanced //注解赋予REstTemplate负载均衡的能力
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }


}
