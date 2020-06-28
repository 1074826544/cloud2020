package com.guo.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2020
 * @description: json封装体
 * @author: guo.li
 * @create: 2020-06-11 13:08
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T   data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
