package com.atguigu.spring5.testdemo;


import com.atguigu.spring5.transactional.service.UserMoneyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-26-20:12
 */

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:beanJDBC.xml")
@SpringJUnitConfig(locations = "classpath:beanJDBC.xml")//上面两个注解的复合注解
public class JTest5 {

    @Autowired
    private UserMoneyService userMoneyService;

    @Test
    public void test1(){
        userMoneyService.accountMoney();
    }

}
