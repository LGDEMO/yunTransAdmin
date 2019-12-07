package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.User_tab;

public interface User_tabMapper {
    int deleteByPrimaryKey(String username);

    int insert(User_tab record);

    int insertSelective(User_tab record);

    User_tab selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(User_tab record);

    int updateByPrimaryKey(User_tab record);
}