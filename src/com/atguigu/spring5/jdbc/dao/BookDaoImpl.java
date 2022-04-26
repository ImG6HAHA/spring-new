package com.atguigu.spring5.jdbc.dao;

import com.atguigu.spring5.jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-25-23:15
 */
//JdbcTemplate操作数据库
@Repository
public class BookDaoImpl implements BookDao{

    //注入 JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;



    @Override
    public void add(Book book) {
        //1 创建 sql 语句
        String sql = "insert into t_book values(?,?,?)";
        //2 调用方法实现
        Object[] args = {book.getUserId(), book.getUsername(),
                book.getUtatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void update(Book book) {
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        Object[] args = {book.getUsername(), book.getUtatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void deleteBook(Integer id) {
        String sql = "delete from t_book where user_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public void batchAddBook(List<Object[]> books) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, books);
        System.out.println(Arrays.toString(ints));

    }

    @Override
    public void batchUpdateBook(List<Object[]> books) {

    }

    @Override
    public void batchDelBook(List<Object[]> ids) {

    }

    //查询返回对象
    @Override
    public Book findBookInfo(Integer id) {
        String sql = "select * from t_book where user_id=?";
        //调用方法
        Book book = jdbcTemplate.queryForObject(sql, new
                BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }


}
