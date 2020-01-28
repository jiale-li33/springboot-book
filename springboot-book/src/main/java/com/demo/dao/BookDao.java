package com.demo.dao;

import com.demo.entity.Book;
import com.demo.entity.QueryVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    List<Book> queryAll(QueryVo queryVo);

    List<Book> queryAllWithClass(QueryVo queryVo);

    Book queryBookById(Integer id);

    Integer addBook(Book book);

    Integer edit(Book book);

    Integer del(Integer id);
}
