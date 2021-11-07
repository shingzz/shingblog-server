package com.shingzz.controller;

import com.shingzz.entity.User;
import com.shingzz.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("getUser")
    public String getUser(User user){
        return userService.queryUserById(user).getUserName();
    }
}
