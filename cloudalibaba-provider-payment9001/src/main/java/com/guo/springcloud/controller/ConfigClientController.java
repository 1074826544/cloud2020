package com.guo.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud2020
 * @description: nacos 配置中心demo
 * @author: guoli
 * @create: 2020-06-17 15:20
 **/
@RestController
@RefreshScope //支持Nacos的动态刷新功能。
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/alibaba/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
