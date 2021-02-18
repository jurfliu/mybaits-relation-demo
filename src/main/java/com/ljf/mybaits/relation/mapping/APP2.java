package com.ljf.mybaits.relation.mapping;

import com.ljf.mybaits.relation.mapping.domain.Users;
import com.ljf.mybaits.relation.mapping.service.UserService;
import com.ljf.mybaits.relation.mapping.service.impl.UserServiceImpl;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName: APP2
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/18 13:18:28 
 * @Version: V1.0
 **/
public class APP2 {
    public static void main(String[] args) throws IOException {

        UserService us=new UserServiceImpl();
       List<Users> userList= us.findAll();
        for (Users user : userList) {
            System.out.println(user);
        }

    }
}
