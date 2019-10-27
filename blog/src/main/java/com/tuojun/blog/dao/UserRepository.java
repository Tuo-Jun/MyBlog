package com.tuojun.blog.dao;

import com.tuojun.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author:TuoJun
 * Date:2019-10-20 9:29
 * Description:(描述)
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}

