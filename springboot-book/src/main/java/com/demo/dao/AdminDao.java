package com.demo.dao;

import com.demo.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {
    Admin login(String name, String password);
}
