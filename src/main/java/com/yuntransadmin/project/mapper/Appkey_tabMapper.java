package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.Appkey_tab;

public interface Appkey_tabMapper {
    int deleteByPrimaryKey(String appkey);

    int insert(Appkey_tab record);

    int insertSelective(Appkey_tab record);

    Appkey_tab selectByPrimaryKey(String appkey);

    int updateByPrimaryKeySelective(Appkey_tab record);

    int updateByPrimaryKey(Appkey_tab record);
}