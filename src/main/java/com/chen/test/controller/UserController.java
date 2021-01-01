package com.chen.test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chen.test.dao.test1.UserMapping;
import com.chen.test.dao.test2.UserMapper;
import com.chen.test.entity.User;
import com.chen.test.entity.UserT2;
import com.chen.test.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
//@MapperScan(basePackages = "com.chen.test.dao")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserMapping userMapping1;

    @GetMapping("/user")
    List<User> getUsers(){
        return userService.getAllUsers();
    }

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user2")
    List<UserT2> getUsersT2(){
        return userMapper.getUser();
    }

}
