package com.jin2ml.blog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author jin2ml
 * @date 2018/9/17 20:08
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel implements Serializable {

    private static final long serialVersionUID = -2981360576842388695L;

    @Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
    protected String id;

    @CreatedDate
    @JsonFormat(pattern="yyyy-MM-dd")
    protected Date createDate;

    @LastModifiedDate
    @JsonFormat(pattern="yyyy-MM-dd")
    protected Date updateDate;

    protected Integer deleteFlag;

}
