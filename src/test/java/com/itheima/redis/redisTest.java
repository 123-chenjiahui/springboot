package com.itheima.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class redisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void redisTest(){
        //String字符串类型
        redisTemplate.boundValueOps("str").set("黑马");
        System.out.println("str="+redisTemplate.opsForValue().get("str"));

        //hash散列
        redisTemplate.boundHashOps("h_set").put("name","黑马");
        redisTemplate.boundHashOps("h_set").put("age","12");
        Set set = redisTemplate.boundHashOps("h_set").keys();
        System.out.println("hash所有的域："+set);
        System.out.println("hash域内所有的值："+redisTemplate.boundHashOps("h_set").values());

        //list列表
        redisTemplate.boundListOps("list").leftPush("1");
        redisTemplate.boundListOps("list").leftPush("a");
        redisTemplate.boundListOps("list").leftPush("b");
        redisTemplate.boundListOps("list").leftPush("c");
        List list = redisTemplate.boundListOps("list").range(0, -1);
        System.out.println("列表的值="+list);


        //set集合
        redisTemplate.boundSetOps("setkey").add("o","p","q");
        Set setkey = redisTemplate.boundSetOps("setkey").members();
        System.out.println("set集合所有值"+setkey);



        //sort  有序集合
        redisTemplate.boundZSetOps("z_set").add("w",10);
        redisTemplate.boundZSetOps("z_set").add("y",20);
        redisTemplate.boundZSetOps("z_set").add("z",30);
        Set z_set = redisTemplate.boundZSetOps("z_set").range(0, -1);
        System.out.println("有序集合中参数="+z_set);

    }
}
