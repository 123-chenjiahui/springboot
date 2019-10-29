package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {
  /*  @Autowired
    private DataSource dataSource;
     @Value("${itcast.url}")
     private String itcastUrl;
     @Value("${itheima.url}")
     private String itheimaUrl;*/

     @Autowired
     private UserServive userServive;

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public User queryById( @PathVariable Integer id){
    return userServive.queryById(id);
}

/*    @GetMapping("hello")
    public String hello(){
       *//* System.out.println("dataSource="+dataSource);
        System.out.println("itcast="+itcastUrl);
        System.out.println("itheima="+itheimaUrl);*//*
        return "hello spring boot";
    }*/
}
