package com.demo.service;

import com.demo.entity.Admin;

public interface AdminService {
    Admin login(String username, String password);
}
