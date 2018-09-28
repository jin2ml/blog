package com.jin2ml.blog.service.impl;

import com.jin2ml.blog.dao.ArticleDAO;
import com.jin2ml.blog.model.Article;
import com.jin2ml.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jin2ml
 * @date 2018/9/27
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDAO articleDAO;

    @Override
    public Article save(Article article) {
        return articleDAO.save(article);
    }

    @Override
    public Article get(String id) {
        return articleDAO.getOne(id);
    }
}
