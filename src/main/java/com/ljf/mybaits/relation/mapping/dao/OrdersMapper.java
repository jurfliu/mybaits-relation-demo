package com.ljf.mybaits.relation.mapping.dao;

import com.ljf.mybaits.relation.mapping.domain.Orders;

import java.util.List;

public interface OrdersMapper {
    //查询全部的方法
    public List<Orders> findAll();
}
