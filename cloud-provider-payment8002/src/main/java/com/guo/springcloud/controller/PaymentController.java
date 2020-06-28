package com.guo.springcloud.controller;

import com.guo.springcloud.entities.CommonResult;
import com.guo.springcloud.entities.Payment;
import com.guo.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description: demo Controllerceng
 * @author: guo.li
 * @create: 2020-06-11 13:28
 **/
@RestController  //控制器带有@RestController批注，因此不需要@ResponseBody。
@Slf4j  //注解在类上；为类提供一个 属性名为log 的 log4j 日志对像
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;
    @Resource
    private PaymentService paymentService;
   /**
   * @Description: df
   * @Author: gouli
   * @Date: 2020/6/11
   */
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        log.info(serverPort+"*****插入结果："+result);

        if(result > 0)
        {
            return new CommonResult(200,"插入数据库成功 "+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);
        log.info(serverPort+"*****查询成功："+payment);
        if(payment != null)
        {
            return new CommonResult(200,"查询成功"+serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }

    /**
     * @Description: Gateway网关
     * @Author: gouli
     * @Date: 2020/6/15
     */
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return serverPort;
    }

}
