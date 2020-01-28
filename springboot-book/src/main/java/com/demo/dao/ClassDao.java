package com.demo.dao;

import com.demo.entity.Class;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassDao {
    List<Class> queryAll();

    Class queryClassById(Integer id);

    Integer addClass(Class cls);

    Integer edit(Class cls);

    Integer del(Integer id);
}
