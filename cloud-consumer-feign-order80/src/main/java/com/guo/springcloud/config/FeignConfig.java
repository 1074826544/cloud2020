package com.guo.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020
 * @description: Feign 打印日志
 * @author: guoli
 * @create: 2020-06-13 13:42
 **/
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
