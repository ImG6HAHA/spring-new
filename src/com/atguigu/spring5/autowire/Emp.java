package com.atguigu.spring5.autowire;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-24-22:00
 */
public class Emp {
    private Dept dept;
    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test() {
        System.out.println(dept);
    }




}
