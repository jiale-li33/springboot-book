package com.demo.service;

import com.demo.entity.Customer;

import java.util.List;

public interface CustomerService {
     Customer login(String username, String password);

    Integer register(Customer customer);

    List<Customer> queryAll();

    Integer del(Integer id);
}
