package com.hxq.service;

import com.hxq.entity.User;

public interface UserService {

    //用户注册
    void register(User user);

    //用户登录
    User login(User user);
}
