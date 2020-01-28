package com.demo.controller;

import com.demo.entity.Book;
import com.demo.entity.Class;
import com.demo.service.ClassService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    @RequestMapping("/classlist")
    public String classlist(Model model) {
        //调用方法
        List<Class> classes = classService.queryAll();

        //返回PageInfo对象
        model.addAttribute("classList",classes);
        return "behind/classList";
    }

    @RequestMapping("/edit")
    public String edit(Integer id, Model model) {

        Class cls = classService.queryClassById(id);
        model.addAttribute("class",cls);

        return "behind/addClass";
    }
    @RequestMapping("/save")
    public String save(Class cls, Model model) {

        if (null==cls.getId()){
            Integer flag = classService.addClass(cls);
        } else {
            Integer flag = classService.edit(cls);
        }

        return "redirect:classlist";
    }
    @RequestMapping("/add")
    public String add(Model model) {
        Class cls = new Class();
        model.addAttribute("class",cls);

        return "behind/addClass";
    }
    @RequestMapping("/del")
    public String del(Integer id,Model model) {
        Integer flag = classService.del(id);
        return "redirect:classlist";
    }
}
