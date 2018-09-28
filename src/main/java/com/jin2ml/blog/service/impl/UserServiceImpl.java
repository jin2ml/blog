package com.jin2ml.blog.service.impl;

import com.jin2ml.blog.dao.UserDAO;
import com.jin2ml.blog.model.User;
import com.jin2ml.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jin2ml
 * @date 2018/9/17 20:24
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public User save(User user) {
        return userDAO.save(user);
    }

    @Override
    public String findPasswordByUsername(String username) {
        return userDAO.findPasswordByUsername(username);
    }
}
