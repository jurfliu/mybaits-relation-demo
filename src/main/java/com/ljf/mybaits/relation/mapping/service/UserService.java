package com.ljf.mybaits.relation.mapping.service;

import com.ljf.mybaits.relation.mapping.domain.Orders;
import com.ljf.mybaits.relation.mapping.domain.Users;

import java.io.IOException;
import java.util.List;

public interface UserService {
    public List<Users> findAll() throws IOException;
    public List<Users> findUserAndRoleAll() throws IOException;
}
