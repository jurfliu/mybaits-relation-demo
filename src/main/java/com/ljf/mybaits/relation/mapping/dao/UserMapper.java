package com.ljf.mybaits.relation.mapping.dao;



import com.ljf.mybaits.relation.mapping.domain.Users;

import java.io.IOException;
import java.util.List;

public interface UserMapper {
    List<Users> findAll() throws IOException;
    public List<Users> findUserAndRoleAll();
}

