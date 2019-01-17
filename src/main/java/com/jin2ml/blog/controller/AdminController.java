package com.jin2ml.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jin2ml
 * @date 2018/9/17 20:54
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("")
    public String show(){
        return "admin/index";
    }

    @RequestMapping("welcome")
    @ResponseBody
    public String welcome(){
        return "hello";
    }

    @RequestMapping("home")
    public String console(){
        return "admin/home";
    }

    @GetMapping("about")
    public String about(){
        return "about";
    }

}
