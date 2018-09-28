package com.jin2ml.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * @author jin2ml
 * @date 2018/9/27
 */
@Configuration
public class UserIDAuditorBean implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        //TODO 获取当前登录用户的ID
        return Optional.empty();
    }

}
