package com.why.service;

import com.why.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();
    String saveUser(User user);
}
