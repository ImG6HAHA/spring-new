package com.atguigu.spring5.jdbc.service;

import com.atguigu.spring5.jdbc.dao.BookDao;
import com.atguigu.spring5.jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-25-23:13
 */
@Service
public class BookService {
    //注入 dao
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){
        bookDao.add(book);
    }

    public void updateBook(Book book){
        bookDao.update(book);
    }

    public void deleteBook(Integer id){
        bookDao.deleteBook(id);
    }


    public void selectCount(){
        int count = bookDao.selectCount();
        System.out.println(count);
    }

    public void batchAddBook(List<Object[]> books){
        bookDao.batchAddBook(books);
    }

    public void batchUpdateBook(List<Object[]> books) {
        bookDao.batchUpdateBook(books);
    }

    public void batchDelBook(List<Object[]> ids) {
        bookDao.batchDelBook(ids);
    }

    public Book findBookInfo(Integer id){
        return bookDao.findBookInfo(id);
    }



}
