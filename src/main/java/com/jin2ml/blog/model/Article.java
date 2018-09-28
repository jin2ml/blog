package com.jin2ml.blog.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 文章
 *
 * @author jin2ml
 * @date 2018/9/27
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class Article extends BaseModel {

    private static final long serialVersionUID = -6125983460377973355L;
    /**
     * 标题
     */
    private String title;
    /**
     * 概要
     */
    private String abstracts;
    /**
     * 内容
     */
    private String content;
    /**
     * 计数
     */
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "count_id")
    private ArticleCount articleCount;

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<Attachment> attachments;

}
