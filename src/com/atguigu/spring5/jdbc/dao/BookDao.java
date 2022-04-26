package com.atguigu.spring5.jdbc.dao;

import com.atguigu.spring5.jdbc.entity.Book;

import java.util.List;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-25-23:14
 */
public interface BookDao {

    /**
     * 添加add
     */
    void add(Book book);


    void update(Book book);

    void deleteBook(Integer id);


    int selectCount();


    void batchAddBook(List<Object[]> books);

    void batchUpdateBook(List<Object[]> books);

    void batchDelBook(List<Object[]> ids);

    //查询返回对象
    Book findBookInfo(Integer id);
}

