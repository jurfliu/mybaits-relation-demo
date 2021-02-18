package com.ljf.mybaits.relation.mapping.service.impl;

import com.ljf.mybaits.relation.mapping.dao.UserMapper;
import com.ljf.mybaits.relation.mapping.domain.Users;
import com.ljf.mybaits.relation.mapping.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/18 13:29:09 
 * @Version: V1.0
 **/
public class UserServiceImpl implements UserService {
    @Override
    public List<Users> findAll() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Users> userList = mapper.findAll();
        sqlSession.close();
        return userList;
    }
}
