package com.demo.dao;

import com.demo.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao {

    Customer login(String username, String password);

    Integer regiter(Customer customer);

    List<Customer> queryAll();

    Integer del(Integer id);
}
