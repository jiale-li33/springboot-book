package com.demo.service;

import com.demo.entity.Book;
import com.demo.entity.QueryVo;

import java.util.List;

public interface BookService {
    List<Book> queryAll(QueryVo queryVo);

}
