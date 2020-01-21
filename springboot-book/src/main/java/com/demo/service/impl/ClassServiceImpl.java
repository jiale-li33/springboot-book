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
}
