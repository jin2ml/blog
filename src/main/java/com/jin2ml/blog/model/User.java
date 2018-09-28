package com.jin2ml.blog.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

/**
 * @author jin2ml
 * @date 2018/9/17 20:12
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class User extends BaseModel{

    private static final long serialVersionUID = -3851380040692628178L;

    private String username;

    private String password;

    private String salt;

    private String address;

    private Integer sex;

    private String email;

    private String level;

    private String qq;

    private String wechat;
    
}
