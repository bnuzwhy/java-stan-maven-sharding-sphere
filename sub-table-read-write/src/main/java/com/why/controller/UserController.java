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
        userList.add(new User(11L,"AA","male",11));
        userList.add(new User(12L,"BB","male",21));
        userList.add(new User(13L,"CC","male",31));
        userList.add(new User(14L,"DD","male",41));
        userList.add(new User(15L,"EE","male",51));
        userList.add(new User(16L,"FF","male",61));
        userList.add(new User(1L,"SA","male",12));
        userList.add(new User(2L,"SB","male",22));
        userList.add(new User(3L,"SC","male",32));
        userList.add(new User(4L,"SD","male",42));
        userList.add(new User(5L,"SE","male",52));
        userList.add(new User(6L,"SF","male",62));
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
