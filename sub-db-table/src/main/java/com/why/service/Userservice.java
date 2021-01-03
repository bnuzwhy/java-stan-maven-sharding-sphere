package com.why.service;

import com.why.entity.User;

import java.util.List;

public interface Userservice {
    String insertBatch(List<User> list);

    List<User> selectAll();

    String insert(User user);

    User selectById(Long id);

    User selectByName(String name);
}
