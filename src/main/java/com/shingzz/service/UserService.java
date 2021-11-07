package com.shingzz.service;

import com.shingzz.entity.User;
import com.shingzz.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    public User queryUserById(User user){
        User resp = userMapper.query(user.getUserId());
        return resp;
    }
}
