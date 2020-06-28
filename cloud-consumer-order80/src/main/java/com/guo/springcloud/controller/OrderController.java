package com.guo.springcloud.controller;

import com.guo.springcloud.entities.CommonResult;
import com.guo.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description: 网关Controller
 * @author: guoli
 * @create: 2020-06-11 15:25
 **/
@RestController
@Slf4j
public class OrderController {

   // public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

//    @Resource
   RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        this.restTemplate = new RestTemplate();
        return restTemplate;
    }

    @Resource
    private DiscoveryClient discoveryClient;


    @Autowired(required = false)
    public OrderController(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    /**
     * @Description: RestTemplate 完成接口调用
     * @Author: gouli
     * @Date: 2020/6/11
     */
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment)  {
        CommonResult<Payment> resut= restTemplate.postForObject(PAYMENT_URL +"/payment/create",payment, CommonResult.class);
        log.info("调用成功，返回："+resut);
        return resut;

    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id)
    {
        CommonResult<Payment> resut=restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
        log.info("调用成功，返回："+resut);
        return resut;
    }

    /**
    * @Description: restTemplate 使用 getForObject《返回json》和getForEntity
    * @Author: gouli
    * @Date: 2020/6/13
    */
    @GetMapping("/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id") Long id)
    {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);

        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else{
            return new CommonResult<>(444,"操作失败");
        }
    }


    // ====    ================> zipkin+sleuth
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin()
    {
        String result = restTemplate.getForObject(PAYMENT_URL+"/payment/zipkin/", String.class);
        return result;
    }

}
