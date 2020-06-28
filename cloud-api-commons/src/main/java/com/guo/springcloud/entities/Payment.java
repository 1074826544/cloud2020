package com.guo.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: cloud2020
 * @description: demo 实体类
 * @author: guo.li
 * @create: 2020-06-11 12:59
 **/
@Data //提供类的get、set、equals、hashCode、canEqual、toString方法
@AllArgsConstructor //提供类的全参构造
@NoArgsConstructor  //注在类上，提供类的无参构造
public class Payment implements Serializable {
    private long id;
    private String serial;
}
