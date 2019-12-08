package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.User_tab;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface User_tabMapper {
    int deleteByPrimaryKey(String username);

    int insert(User_tab record);

    int insertSelective(User_tab record);

    User_tab selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(User_tab record);

    int updateByPrimaryKey(User_tab record);
    User_tab login(String username);//用户登录
    User_tab getDataByUserName(String username);//通过名字获取用户，判断有没有登录

}