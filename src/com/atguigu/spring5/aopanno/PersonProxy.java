package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-26-0:01
 */
@Component
@Aspect//生成代理对象
@Order(1)//优先级 数字越小优先级越高
public class PersonProxy {

    //前置通知
    //@Before 注解表示作为前置通知
    @Before(value = "com.atguigu.spring5.aopanno.UserProxy.pointdemo()")
    public void before() {//前置通知
        System.out.println("peron before......");
    }

}
