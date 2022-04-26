package com.atguigu.spring5.jdbc.entity;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-25-23:15
 */
public class Book {

    private int userId;
    private String username;
    private String utatus;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUtatus() {
        return utatus;
    }

    public void setUtatus(String utatus) {
        this.utatus = utatus;
    }


}
