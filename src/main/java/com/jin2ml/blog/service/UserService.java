package com.jin2ml.blog.service;

import com.jin2ml.blog.model.User;

import java.util.List;

/**
 * @author jin2ml
 * @date 2018/9/17 20:24
 */
public interface UserService {

    List<User> findAll();

    User save(User user);

    String findPasswordByUsername(String username);
}
