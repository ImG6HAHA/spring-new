package com.atguigu.spring5.transactional.dao;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-26-0:54
 */
public interface UserDao {
    //lucy 转账 100 给 mary
    //少钱
    void reduceMoney();

    //多钱
    void addMoney();
}
