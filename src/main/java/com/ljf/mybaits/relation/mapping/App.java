package com.ljf.mybaits.relation.mapping;

import com.ljf.mybaits.relation.mapping.domain.Orders;
import com.ljf.mybaits.relation.mapping.service.OrderService;
import com.ljf.mybaits.relation.mapping.service.impl.OrderServiceImpl;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!t
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        OrderService os=new OrderServiceImpl();
        List<Orders> orderList=os.findAll();
        for (Orders order : orderList) {
            System.out.println(order);
        }
        System.out.println( "Hello World!" );
    }
}
