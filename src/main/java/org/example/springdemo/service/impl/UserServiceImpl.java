package org.example.springdemo.service.impl;

import org.example.springdemo.mapper.UserMapper;
import org.example.springdemo.model.User;
import org.example.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }
}
