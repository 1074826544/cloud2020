package com.guo.springcloud.service.impl;

import com.guo.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @program: cloud2020
 * @description: 高并发 熔断降低
 * @author: guoli
 * @create: 2020-06-13 17:16
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
