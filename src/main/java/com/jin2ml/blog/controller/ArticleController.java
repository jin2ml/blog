package com.jin2ml.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jin2ml
 * @date 2018/9/17 21:29
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @RequestMapping("list")
    public String list(){
        return "article/list";
    }

}
