package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.Sys_memory_tab;

public interface Sys_memory_tabMapper {
    int deleteByPrimaryKey(Integer vocabId);

    int insert(Sys_memory_tab record);

    int insertSelective(Sys_memory_tab record);

    Sys_memory_tab selectByPrimaryKey(Integer vocabId);

    int updateByPrimaryKeySelective(Sys_memory_tab record);

    int updateByPrimaryKey(Sys_memory_tab record);
}