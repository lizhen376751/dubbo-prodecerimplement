package com.dubbo.prodecterimplement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 读取xml文件的启动类
 * Created by lizhen on 2018/4/14.
 */
public class MainTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("prodcer.xml");
        classPathXmlApplicationContext.start();
        System.out.println("接口实现类，启动了！！！！");
        try {
            //为了测试，保证这个项目一直在启动
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
