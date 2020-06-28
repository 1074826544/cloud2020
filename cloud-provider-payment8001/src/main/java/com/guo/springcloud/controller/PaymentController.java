package com.guo.springcloud.controller;

import com.guo.springcloud.entities.CommonResult;
import com.guo.springcloud.entities.Payment;
import com.guo.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    /*
   Eureka服务发现注册都是通过DiscoveryClient来实现的，
    随着版本变迁把DiscoveryClient服务注册抽离出来变成了ServiceRegistry抽象，
    专门负责服务注册，DiscoveryClient专门负责服务发现。
    还提供了负载均衡的发现LoadBalancerClient抽象。
     */

    @Resource
    private DiscoveryClient discoveryClient;
    /**
    * @Description:  获取Eureka 服务注册列表
    * @Author: gouli
    * @Date: 2020/6/12
    */
    @GetMapping(value = "/payment/discovery")
    public Object discovery()
    {
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("*****element: "+element);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;
    }

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
        log.info("*****插入结果："+result);

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
        log.info(serverPort+"*****询成功："+payment);
        if(payment != null)
        {
            return new CommonResult(200,"查询成功"+serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }
    /**
    * @Description: 测试openFeign 超时问题
    * @Author: gouli
    * @Date: 2020/6/13
    */
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout()
    {
        // 业务逻辑处理正确，但是需要耗费3秒钟
        try { TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
        return serverPort;
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



    @GetMapping("/payment/zipkin")
    public String paymentZipkin()
    {
        return "hi ,i'am paymentzipkin server fall back，welcome to ggg，O(∩_∩)O哈哈~";
    }

}
