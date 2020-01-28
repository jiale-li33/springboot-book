package com.demo.service.impl;

import com.demo.dao.ClassDao;
import com.demo.entity.Class;
import com.demo.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassDao classDao;

    @Override
    public List<Class> queryAll() {
        return classDao.queryAll();
    }

    @Override
    public Class queryClassById(Integer id) {
        return classDao.queryClassById(id);
    }

    @Override
    public Integer addClass(Class cls) {
        return classDao.addClass(cls);
    }

    @Override
    public Integer edit(Class cls) {
        return classDao.edit(cls);
    }

    @Override
    public Integer del(Integer id) {
        return classDao.del(id);
    }
}
