package com.demo.controller;

import com.demo.entity.Book;
import com.demo.entity.Class;
import com.demo.entity.QueryVo;
import com.demo.service.BookService;
import com.demo.service.ClassService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private ClassService classService;

    @RequestMapping("/list")
    public String list(QueryVo queryVo, Model model) {
        List<Class> classes = classService.queryAll();
        model.addAttribute("classList",classes);

        PageHelper.startPage(queryVo.getPage(), queryVo.getRows());
        //调用方法
        List<Book> books = bookService.queryAll(queryVo);

        //返回PageInfo对象
        PageInfo<Book> bookPageInfo = new PageInfo<Book>(books);
        System.out.println(bookPageInfo);
        model.addAttribute("page",bookPageInfo);
        return "before/bookList";
    }
}
