package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.User_log_tab;

public interface User_log_tabMapper {
    int deleteByPrimaryKey(Integer optionId);

    int insert(User_log_tab record);

    int insertSelective(User_log_tab record);

    User_log_tab selectByPrimaryKey(Integer optionId);

    int updateByPrimaryKeySelective(User_log_tab record);

    int updateByPrimaryKey(User_log_tab record);
}