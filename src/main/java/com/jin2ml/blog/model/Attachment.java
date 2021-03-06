package com.jin2ml.blog.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

/**
 * 附件
 * @author jin2ml
 * @date 2018/9/27
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class Attachment extends BaseModel {

    private static final long serialVersionUID = 4411513290363366659L;

    String fileName;

    String fileType;

    String fileUrl;

    String fileSize;

}
