package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.config.TransConfig;
import com.atguigu.spring5.transactional.service.UserMoneyService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-26-1:01
 */
public class TestTransactional {

    //注解
    @Test
    public void test1(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanJDBC.xml");
        UserMoneyService userMoneyService = context.getBean("userMoneyService", UserMoneyService.class);
        userMoneyService.accountMoney();

    }

    //配置文件
    @Test
    public void test2(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanTrans.xml");
        UserMoneyService userMoneyService = context.getBean("userMoneyService", UserMoneyService.class);
        userMoneyService.accountMoney();

    }

    //完全注解
    @Test
    public void test3() {

        ApplicationContext context =new AnnotationConfigApplicationContext(TransConfig.class);
        UserMoneyService userMoneyService = context.getBean("userMoneyService", UserMoneyService.class);
        userMoneyService.accountMoney();
    }


    //函数式风格创建对象 交给spring进行管理
    @Test
    public void testGenericApplicationContext(){

        //1 创建 GenericApplicationContext 对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2 调用 context 的方法对象注册
        context.refresh();
        context.registerBean("user1",User.class,() -> new User());
        //3 获取在 spring 注册的对象
//         User user = (User)context.getBean("com.atguigu.spring5.testdemo.User");
        User user = (User)context.getBean("user1");
        System.out.println(user);


    }




}
