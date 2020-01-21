package com.demo.service;

import com.demo.entity.Order;

import java.util.List;

public interface OrderService {
    Integer queryCount(Order order);

    Integer update(Order order);

    Integer add(Order order);

    List<Order> findAll(Integer cusid);

    Integer orderDel(Integer id);

    Integer queryCountById(Integer id);

    Integer remove(Integer id);

    int delById(int id);

}
