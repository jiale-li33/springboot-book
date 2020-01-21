package com.demo.service.impl;

import com.demo.dao.OrderDao;
import com.demo.entity.Order;
import com.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;


    @Override
    public Integer queryCount(Order order) {
        return orderDao.queryCount(order);
    }

    @Override
    public Integer update(Order order) {
        return orderDao.update(order);
    }

    @Override
    public Integer add(Order order) {
        return orderDao.add(order);
    }

    @Override
    public List<Order> findAll(Integer cusid) {
        return orderDao.findAll(cusid);
    }

    @Override
    public Integer orderDel(Integer id) {
        return orderDao.orderDel(id);
    }

    @Override
    public Integer queryCountById(Integer id) {
        return orderDao.queryCountById(id);
    }

    @Override
    public Integer remove(Integer id) {
        return orderDao.remove(id);
    }

    @Override
    public int delById(int id) {
        return orderDao.delById(id);
    }


}
