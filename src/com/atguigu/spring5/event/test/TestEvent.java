package com.atguigu.spring5.event.test;
import com.atguigu.spring5.event.service.MyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-05-02-21:00
 */
public class TestEvent {



    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanEvent.xml");
        MyService myService = context.getBean("myService", MyService.class);
        myService.doBusiness();
    }


}
