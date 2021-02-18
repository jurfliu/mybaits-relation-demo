package com.ljf.mybaits.relation.mapping.service.impl;

import com.ljf.mybaits.relation.mapping.dao.OrdersMapper;
import com.ljf.mybaits.relation.mapping.domain.Orders;
import com.ljf.mybaits.relation.mapping.service.OrderService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: OrderServiceImpl
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/17 23:09:12 
 * @Version: V1.0
 **/
public class OrderServiceImpl implements OrderService {
    @Override
    public List<Orders> findAll() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<Orders> orderList = mapper.findAll();
        sqlSession.close();
        return orderList;
    }
}
