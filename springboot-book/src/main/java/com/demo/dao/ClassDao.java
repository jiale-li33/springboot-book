package com.demo.dao;

import com.demo.entity.Class;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassDao {
    List<Class> queryAll();
}
