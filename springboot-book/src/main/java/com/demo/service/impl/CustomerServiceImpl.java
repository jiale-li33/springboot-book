package com.demo.service.impl;

import com.demo.dao.CustomerDao;
import com.demo.entity.Customer;
import com.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer login(String username, String password) {
        return customerDao.login(username,password);
    }

    @Override
    public Integer register(Customer customer) {
        return customerDao.regiter(customer);
    }

    @Override
    public List<Customer> queryAll() {
        return customerDao.queryAll();
    }

    @Override
    public Integer del(Integer id) {
        return customerDao.del(id);
    }
}
