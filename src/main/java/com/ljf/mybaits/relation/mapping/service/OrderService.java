package com.ljf.mybaits.relation.mapping.service;

import com.ljf.mybaits.relation.mapping.domain.Orders;

import java.io.IOException;
import java.util.List;

public interface OrderService {
    public List<Orders> findAll() throws IOException;
}
