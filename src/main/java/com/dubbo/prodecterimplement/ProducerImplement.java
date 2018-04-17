package com.dubbo.prodecterimplement;

import com.dubbo.producer.ProducerInterface;

/**
 * 实现生产者项目的接口
 * Created by lizhen on 2018/4/14.
 */
public class ProducerImplement implements ProducerInterface {
    public String getName(String s) {
       if ("1".equals(s)){
           return "hello lizhen！！！";
       }
       if ("2".equals(s)){
           return "hello mayun";
       }
       return "您好 ， 小马哥！！";
    }
}
