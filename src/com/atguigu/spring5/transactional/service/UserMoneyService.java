package com.atguigu.spring5.transactional.service;

import com.atguigu.spring5.transactional.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-26-0:55
 */
@Service
@Transactional(readOnly = false,timeout = -1,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class UserMoneyService {

    @Autowired
    private UserDao userDao;


    //转账的方法
    public void accountMoney() {
//        try {
            //1 开启事务

            //2 业务操作

            //lucy 少 100
            userDao.reduceMoney();

            //模拟异常
            int i=100/0;

            //mary 多 100
            userDao.addMoney();

            //3 没有问题就提交事务
//        } catch (Exception e) {
//            //4 出现异常 进行回滚
//        }
    }



}
