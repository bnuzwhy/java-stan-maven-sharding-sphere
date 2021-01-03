package com.why.service.impl;

import com.why.entity.User;
import com.why.mapper.UserMapper;
import com.why.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements Userservice {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String insertBatch(List<User> list) {
        list.forEach(user->{
            user.setCreateTime(LocalDateTime.now());
            user.setUpdateTime(LocalDateTime.now());
            user.setStatus(0);
        });
        return userMapper.insertBatch(list) >0?"保存成功":"XXXXXX";
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public String insert(User user) {
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        user.setStatus(0);
        return userMapper.insert(user) == 1?"保存成功":"XXXXXX";
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public User selectByName(String name) {
        return userMapper.selectByName(name);
    }
}
