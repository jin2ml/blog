package com.jin2ml.blog.dao;

import com.jin2ml.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author jin2ml
 * @date 2018/9/17 20:23
 */
public interface UserDAO extends JpaRepository<User, String> {

    @Query()
    String findPasswordByUsername(String username);

}
