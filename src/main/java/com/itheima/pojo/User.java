package com.itheima.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data    //自动提供getter setter toString 等方法
@Table(name = "user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)  //组件自动回填
    private Integer id;

    private Integer age;
    private String name;
    private String address;
    private String gender;
    private String username;
    private String password;
    private String email;
    private String qq;
}
