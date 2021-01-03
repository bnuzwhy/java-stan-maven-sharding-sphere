package com.why.controller;

import com.why.entity.User;
import com.why.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private Userservice userservice;

    static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(1L,"AA","male",10));
        userList.add(new User(2L,"BB","male",20));
        userList.add(new User(3L,"CC","male",30));
        userList.add(new User(4L,"DD","male",40));
        userList.add(new User(5L,"EE","male",50));
        userList.add(new User(6L,"FF","male",60));
    }
    @GetMapping("/saveUsers")
    public Object saveUsers(){
        return userservice.insertBatch(userList);
    }
    @GetMapping("/saveUser")
    public Object saveUser(){
        return userservice.insert(new User(System.currentTimeMillis(), "FF","male",60));
    }

    @GetMapping("/selectAll")
    public Object selectAll(){
        return userservice.selectAll();
    }

    @GetMapping("/select/{id}")
    public Object selectById(@PathVariable("id") Long id){
        return userservice.selectById(id);
    }

    @GetMapping("/select/api/{name}")
    public Object selectByName(@PathVariable("name") String name){
        return userservice.selectByName(name);
    }
}
