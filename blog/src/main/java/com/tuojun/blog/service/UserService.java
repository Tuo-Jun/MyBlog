package com.tuojun.blog.service;

import com.tuojun.blog.po.User;

/**
 * Author:TuoJun
 * Date:2019-10-20 9:26
 * Description:(描述)
 */
public interface UserService {
    User checkUser(String username, String password);
}
