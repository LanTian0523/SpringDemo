package org.example.springdemo.controller;

import org.example.springdemo.model.User;
import org.example.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User selectById(Integer id) {
        return userService.selectById(id);
    }
}
