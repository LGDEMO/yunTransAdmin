package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.Apk_tab;

public interface Apk_tabMapper {
    int deleteByPrimaryKey(Integer apkId);

    int insert(Apk_tab record);

    int insertSelective(Apk_tab record);

    Apk_tab selectByPrimaryKey(Integer apkId);

    int updateByPrimaryKeySelective(Apk_tab record);

    int updateByPrimaryKey(Apk_tab record);
}