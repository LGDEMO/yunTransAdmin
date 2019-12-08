package com.yuntransadmin.project.controller;

import com.yuntransadmin.project.bean.ResponseBean;
import com.yuntransadmin.project.model.User_tab;
import com.yuntransadmin.project.service.UserService;
import com.yuntransadmin.project.util.JWTUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ligang
 * @create 2019-12-07 18:55
 */
@RestController
@CrossOrigin
public class UserController {
    private static final Logger LOGGER = LogManager.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @Autowired
    public void setService(UserService userService) {
        this.userService = userService;
    }


    /**
     *@描述:登录并且返回一个cookies
     *@参数 [username, password, response, request]
     *@返回值 com.yuntransadmin.project.bean.ResponseBean
     *@创建人 ligang
     *@创建时间 2019/12/8
     *@修改人和其它信息:cmt  生成快捷键
     */
    @PostMapping("user/login")
    public ResponseBean login(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");//对request传过来的参数设置编码格式，以免传入中文的时候出现问题，必须在request.getParameter之前设置
        User_tab userList = userService.login(username);
        if (userList != null) {
            if (userList.getPassword().equals(password)) {
                String name = JWTUtil.sign(username, password);
                Cookie cookie = new Cookie("name", name);
                cookie.setHttpOnly(true);
                cookie.setPath("/yuntrans");
                response.addCookie(cookie);
                return new ResponseBean(1, "Login success", username);
            } else {
                return new ResponseBean(0, "password entered is ERROR!!!", username);
            }
        } else {
            return new ResponseBean(0, "The username and password entered is ERROR!!!", username);
        }
    }

    /*
       获取用户列表
       # 获取用户列表（无检索）
     */

    @GetMapping("user/getUserList")
    public Map getUserList() {
        Map resulMap = new HashMap<>();

        return resulMap;
    }

}
