package com.atguigu.spring5.event.listener;

import com.atguigu.spring5.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-05-02-20:56
 */
//监听器
@Component
//public class MyListener implements ApplicationListener<MyEvent> {
//
//
//    @Override
//    public void onApplicationEvent(MyEvent event) {
//        System.out.println("发送短信");
//        System.out.println("发送邮件");
//    }
//
//
//}
public class MyListener {

    @EventListener
    public void lintener(MyEvent myEvent){
        System.out.println("发送短信");
        System.out.println("发送邮件");
    }
}
