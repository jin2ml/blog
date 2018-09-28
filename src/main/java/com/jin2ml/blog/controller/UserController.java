package com.jin2ml.blog.controller;

import com.jin2ml.blog.model.User;
import com.jin2ml.blog.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jin2ml
 * @date 2018/9/17 20:25
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "123";
    }

    @RequestMapping("save")
    @ResponseBody
    public User save(User user){
        return userService.save(user);
    }
}
