package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.User_memory_tab;

public interface User_memory_tabMapper {
    int deleteByPrimaryKey(Integer memoryId);

    int insert(User_memory_tab record);

    int insertSelective(User_memory_tab record);

    User_memory_tab selectByPrimaryKey(Integer memoryId);

    int updateByPrimaryKeySelective(User_memory_tab record);

    int updateByPrimaryKey(User_memory_tab record);
}