package com.ljf.mybaits.relation.mapping.domain;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: Orders
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/17 21:30:37 
 * @Version: V1.0
 **/
public class Orders {
    private int id;
    private Date orderTime;
    private double total;

    //当前订单属于哪一个用户
    private Users user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderTime=" + orderTime +
                ", total=" + total +
                ", user=" + user +
                '}';
    }
}
