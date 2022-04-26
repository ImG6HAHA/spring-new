package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.jdbc.entity.Book;
import com.atguigu.spring5.jdbc.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-25-23:21
 */
public class TestJDBC {



    @Test
    public void test1(){

        ApplicationContext context =new ClassPathXmlApplicationContext("beanJDBC.xml");
        BookService bookService = context.getBean("bookService",BookService.class);
        Book book = new Book();
        book.setUserId(1);
        book.setUsername("java");
        book.setUtatus("a");
        bookService.addBook(book);

    }

    @Test
    public void test2(){

        ApplicationContext context =new ClassPathXmlApplicationContext("beanJDBC.xml");
        BookService bookService = context.getBean("bookService",BookService.class);
        Book book = new Book();
        book.setUserId(1);
        book.setUsername("javaupupup");
        book.setUtatus("a");
        bookService.updateBook(book);


    }

    @Test
    public void test3(){

        ApplicationContext context =new ClassPathXmlApplicationContext("beanJDBC.xml");
        BookService bookService = context.getBean("bookService",BookService.class);
        bookService.deleteBook(1);

    }

    @Test
    public void test4(){

        ApplicationContext context =new ClassPathXmlApplicationContext("beanJDBC.xml");
        BookService bookService = context.getBean("bookService",BookService.class);
        Book bookInfo = bookService.findBookInfo(1);
        System.out.println(bookInfo.getUsername());

    }

    //批量添加
    @Test
    public void test5(){

        ApplicationContext context =new ClassPathXmlApplicationContext("beanJDBC.xml");
        BookService bookService = context.getBean("bookService",BookService.class);
        List<Object[]> list =new ArrayList<>();
        Object[] o1 = {"10","java","a"};
        Object[] o2 = {"11","c++","b"};
        Object[] o3 = {"12","MySQL","c"};
        list.add(o1);
        list.add(o2);
        list.add(o3);

        bookService.batchAddBook(list);

    }




}
