package com.atguigu.spring5.event.service;

import com.atguigu.spring5.event.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-05-02-20:58
 */
@Service
public class MyService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;//发布器


    public void doBusiness(){
        System.out.println("主线业务");

        applicationEventPublisher.publishEvent(new MyEvent("test"));
    }


}
