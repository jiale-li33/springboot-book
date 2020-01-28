package com.demo.service;

import com.demo.entity.Book;
import com.demo.entity.QueryVo;

import java.util.List;

public interface BookService {
    List<Book> queryAll(QueryVo queryVo);

    List<Book> queryAllWithClass(QueryVo queryVo);

    Book queryBookById(Integer id);

    Integer addBook(Book book);

    Integer edit(Book book);

    Integer del(Integer id);
}
