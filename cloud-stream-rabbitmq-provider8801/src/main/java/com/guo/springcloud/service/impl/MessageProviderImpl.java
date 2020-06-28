package com.guo.springcloud.service.impl;

import com.guo.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;


/**
 * @program: cloud2020
 * @description: 消息推送
 * @author: guoli
 * @create: 2020-06-15 16:58
 **/
@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output; // 消息发送管道
    /**
     * @Description: 发送消息
     * @Author: gouli
     * @Date: 2020/6/15
     */
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: "+serial);
        return null;
    }
}
