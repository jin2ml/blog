package com.jin2ml.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * SpringBoot启动类
 * @author jin2ml
 * @date 2018/9/27
 */
@SpringBootApplication
@EnableJpaAuditing
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
}
