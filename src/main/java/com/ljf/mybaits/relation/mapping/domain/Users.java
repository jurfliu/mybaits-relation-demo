package com.ljf.mybaits.relation.mapping.domain;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: Users
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/17 21:30:28 
 * @Version: V1.0
 **/
public class Users {
    private int id;
    private String userName;
    private Date birthday;
    //描述的是当前用户存在哪些订单
    private List<Orders> orderList;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Orders> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", birthday=" + birthday +
                ", orderList=" + orderList +
                '}';
    }
}
