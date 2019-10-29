package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


/*@Configuration
@PropertySource("classpath:application.yml")
public class jdbcConfig {
     @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.driverClassName}")
    String driverName;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverName);
        return dataSource;

}  }*/

@Configuration
@EnableConfigurationProperties(jdbcProperties.class)  //声明使用jdbcProperties这个对象的类
public class jdbcConfig {

  /*  @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(jdbcProperties jdbc) {

     *//*   DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbc.getDriverClassName());
        dataSource.setUrl(jdbc.getUrl());
        dataSource.setPassword(jdbc.getUsername());
        dataSource.setPassword(jdbc.getPassword());
        return dataSource;*//*
     return new DruidDataSource();
    }*/
}
