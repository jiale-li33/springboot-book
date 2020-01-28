package com.demo.service;

import com.demo.entity.Class;

import java.util.List;

public interface ClassService {
    List<Class> queryAll();

    Class queryClassById(Integer id);

    Integer addClass(Class cls);

    Integer edit(Class cls);

    Integer del(Integer id);
}
