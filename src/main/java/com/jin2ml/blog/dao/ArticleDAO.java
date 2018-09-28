package com.jin2ml.blog.dao;

import com.jin2ml.blog.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jin2ml
 * @date 2018/9/27
 */
@Repository
public interface ArticleDAO extends JpaRepository<Article, String> {
}
