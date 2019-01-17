package com.jin2ml.blog.controller;

import com.jin2ml.blog.model.Article;
import com.jin2ml.blog.model.ArticleCount;
import com.jin2ml.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jin2ml
 * @date 2018/9/27
 */
@Controller
@RequestMapping("home")
public class FrontController {

    @Autowired
    ArticleService articleService;

    /**
     * 前台首页
     */
    @GetMapping("")
    public String index(){
        Article article = new Article();
        ArticleCount articleCount = new ArticleCount();
        articleCount.setCounts("123");
        article.setArticleCount(articleCount);
        articleService.save(article);
        Article article1 = articleService.get("4028826b661a4c2c01661a4c686a0000");
        System.out.println(article1);
        return "front/index";
    }

    /**
     * 前台关于
     */
    @GetMapping("about")
    public String about(){
        return "front/about";
    }

    @GetMapping("detail")
    public String detail(){
        return "front/details";
    }

}
