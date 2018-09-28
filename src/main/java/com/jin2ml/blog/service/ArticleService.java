package com.jin2ml.blog.service;

import com.jin2ml.blog.model.Article;

/**
 * @author jin2ml
 * @date 2018/9/27
 */
public interface ArticleService {

    Article save(Article article);

    Article get(String id);

}
