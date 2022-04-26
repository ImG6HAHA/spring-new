package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.transactional.service.UserMoneyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-26-20:02
 */

@RunWith(SpringJUnit4ClassRunner.class)//单元测试框架
@ContextConfiguration("classpath:beanJDBC.xml")//加载配置文件
public class JTest4 {

    @Autowired
    private UserMoneyService userMoneyService;

    @Test
    public void test1(){
        userMoneyService.accountMoney();
    }


}
