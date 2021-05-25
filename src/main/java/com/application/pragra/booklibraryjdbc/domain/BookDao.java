package com.application.pragra.booklibraryjdbc.domain;

import com.application.pragra.booklibraryjdbc.dao.Book;
import com.application.pragra.booklibraryjdbc.sql.SQLs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createTable(){
      jdbcTemplate.execute(SQLs.CREATETABLE);
    }

    public Book insert(Book book){
        String sql ="insert into book values(?,?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{book.getBookId(),book.getBookName(),book.getBookAuthor()
                ,book.getBookPublication(),book.getCreateDate(),book.getPrice()});
        return book;
    }

    public Book update(Book book){
        String sql = "update book set Book_Author=? where book_id =?";
        jdbcTemplate.update(sql,new Object[]{book.getBookAuthor(),book.getBookId()});
        return book;
    }

    public Book getBookById(int id){
        String sql ="select * from book where book_id =?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Book.class),id);
    }
    public List<Book> getAllBooks(){
        String sql = "select * from book";
        List<Book> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        return list;
    }

    public void delete(int id){
        String sql ="Delete from book where book_id =?";
         jdbcTemplate.update(sql, id);
    }

}
