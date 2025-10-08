package org.example.springdemo.service;

import org.example.springdemo.model.User;

public interface UserService {

    public User selectById(Integer id);
}
