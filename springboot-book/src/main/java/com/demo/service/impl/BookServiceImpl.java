package com.demo.service.impl;

import com.demo.dao.BookDao;
import com.demo.entity.Book;
import com.demo.entity.QueryVo;
import com.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> queryAll(QueryVo queryVo) {
        return bookDao.queryAll(queryVo);
    }

    @Override
    public List<Book> queryAllWithClass(QueryVo queryVo) {
        return bookDao.queryAllWithClass(queryVo);
    }

    @Override
    public Book queryBookById(Integer id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public Integer addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public Integer edit(Book book) {
        return bookDao.edit(book);
    }

    @Override
    public Integer del(Integer id) {
        return bookDao.del(id);
    }
}
