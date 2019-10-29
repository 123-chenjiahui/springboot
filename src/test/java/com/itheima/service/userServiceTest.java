package com.itheima.service;

import com.itheima.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class userServiceTest  {

    @Autowired
    private UserServive userServive;

    @Test
    public void queryId(){
        User user = userServive.queryById(25);
        System.out.println("user="+user);
    }



    @Test
    public void  saveUser(){
        User user = new User();
        user.setId(40);
        user.setAge(22);
        user.setAddress("北京");
        user.setGender("男");
        user.setName("lucy");
        userServive.saveUser(user);

    }

}
