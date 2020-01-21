package com.demo.service;

import com.demo.entity.Customer;

public interface CustomerService {
     Customer login(String username, String password);

    Integer register(Customer customer);
}
