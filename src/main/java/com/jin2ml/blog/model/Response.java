package com.jin2ml.blog.model;

import lombok.Data;

/**
 * @author jin2ml
 * @date 2018/9/28
 */
@Data
public class Response {

    private Integer code;

    private String message;

    private Object data;
}
