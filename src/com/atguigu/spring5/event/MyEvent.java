package com.atguigu.spring5.event;

import org.springframework.context.ApplicationEvent;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-05-02-20:56
 */
//事件
public class MyEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }
}
