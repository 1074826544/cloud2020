package com.guo.springcloud.dao;

import com.guo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @description: demo 的dao类
 * @author: guo.li
 * @create: 2020-06-11 13:13
 **/
@Mapper //Repository和@Mapper   建议使用mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
