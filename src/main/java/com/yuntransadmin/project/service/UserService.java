package com.yuntransadmin.project.service;

import com.yuntransadmin.project.model.User_tab;

import java.util.List;

/**
 * @author ligang
 * @create 2019-12-08 9:46
 */
public interface UserService {
  User_tab getDataByUserName(String username);//通过用户名获取对应信息
  User_tab login(String username);//登录
  List<User_tab>  getUserList();
}
