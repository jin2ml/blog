package com.jin2ml.blog.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

/**
 * @author jin2ml
 * @date 2018/9/27
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class ArticleCount extends BaseModel{

    private static final long serialVersionUID = 8895478677559156352L;

    private String counts;

}
