package com.ljf.mybaits.relation.mapping;

import com.ljf.mybaits.relation.mapping.domain.Users;
import com.ljf.mybaits.relation.mapping.service.UserService;
import com.ljf.mybaits.relation.mapping.service.impl.UserServiceImpl;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName: App3
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/18 14:50:15 
 * @Version: V1.0
 **/
public class App3 {
    public static void main(String[] args) throws IOException {
        UserService us=new UserServiceImpl();
       List<Users> userAndRoleAll =us.findUserAndRoleAll();
        for (Users user : userAndRoleAll) {
            System.out.println(user);
        }

    }
}
