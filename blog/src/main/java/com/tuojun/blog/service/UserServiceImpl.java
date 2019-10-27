package com.tuojun.blog.service;

import com.tuojun.blog.dao.UserRepository;
import com.tuojun.blog.po.User;
import com.tuojun.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author:TuoJun
 * Date:2019-10-20 9:27
 * Description:(描述)
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
