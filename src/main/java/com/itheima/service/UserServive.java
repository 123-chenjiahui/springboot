package com.itheima.service;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class UserServive {

    @Autowired
    private UserMapper userMapper;

    public User queryById(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        System.out.println(user.getAddress());
        return user;
    }

    @Transactional
    public void saveUser(User user) {
        System.out.println("新增用户。。。。。");
        userMapper.insertSelective(user);
    }
}
