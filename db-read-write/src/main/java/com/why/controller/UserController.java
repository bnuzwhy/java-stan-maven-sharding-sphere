package com.why.controller;

import com.why.entity.User;
import com.why.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/save")
    public String saveUser(){
        return userService.saveUser(new User("小王","男",10));
    }

    @GetMapping("/selectAll")
    public List<User> selectAll(){
        return userService.selectAll();
    }
}
