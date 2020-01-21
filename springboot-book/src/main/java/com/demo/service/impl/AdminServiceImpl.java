package com.demo.service.impl;

import com.demo.dao.AdminDao;
import com.demo.entity.Admin;
import com.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin login(String name, String password) {
        return adminDao.login(name,password);
    }
}
