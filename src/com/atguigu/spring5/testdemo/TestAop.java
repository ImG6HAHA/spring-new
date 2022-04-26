package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.aopanno.User;
import com.atguigu.spring5.aopxml.Book;
import com.atguigu.spring5.config.AopConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-25-18:45
 */
public class TestAop {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanAOP.xml");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class); //todo 有个bug 引入JDBC之后就报错了
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanAOP2.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.buy();
    }



}
