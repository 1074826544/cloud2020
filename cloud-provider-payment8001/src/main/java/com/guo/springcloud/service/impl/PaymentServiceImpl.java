package com.guo.springcloud.service.impl;

import com.guo.springcloud.dao.PaymentDao;
import com.guo.springcloud.entities.Payment;
import com.guo.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description: demo-实现类
 * @author: guo.li
 * @create: 2020-06-11 13:23
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
