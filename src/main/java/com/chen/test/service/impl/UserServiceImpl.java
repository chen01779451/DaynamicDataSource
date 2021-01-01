package com.chen.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.test.dao.test1.UserMapping;
import com.chen.test.entity.User;
import com.chen.test.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapping,User> implements UserService {


    @Override
    public List<User> getAllUsers() {
        return baseMapper.getUsers();
    }
}
