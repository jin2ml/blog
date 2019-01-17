package com.jin2ml.blog.controller;

import com.jin2ml.blog.model.Response;
import com.jin2ml.blog.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jin2ml
 * @date 2018/9/28
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 登陆
     *
     * @param username 用户名
     * @param password 密码
     */
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public Response doLogin(String username, String password) {
        Response response = new Response();
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        subject.login(token);
        //根据权限，指定返回数据
//        String role = userService.getRole(username);
//        if ("user".equals(role)) {
//            return resultMap.success().message("欢迎登陆");
//        }
//        if ("admin".equals(role)) {
//            return resultMap.success().message("欢迎来到管理员页面");
//        }
        response.setCode(0);
        return response;
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }


}
