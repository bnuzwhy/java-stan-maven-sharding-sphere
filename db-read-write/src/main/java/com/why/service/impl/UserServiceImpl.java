package com.why.service.impl;

import com.why.entity.User;
import com.why.mapper.UserMapper;
import com.why.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectUsers();
    }

    @Override
    public String saveUser(User user) {
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        user.setStatus(1);
        return userMapper.insertUser(user) == 1 ? "保存成功":"XXXXXX";
    }
}
