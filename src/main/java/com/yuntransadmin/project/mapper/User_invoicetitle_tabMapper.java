package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.User_invoicetitle_tab;

public interface User_invoicetitle_tabMapper {
    int deleteByPrimaryKey(String invoicetitleId);

    int insert(User_invoicetitle_tab record);

    int insertSelective(User_invoicetitle_tab record);

    User_invoicetitle_tab selectByPrimaryKey(String invoicetitleId);

    int updateByPrimaryKeySelective(User_invoicetitle_tab record);

    int updateByPrimaryKey(User_invoicetitle_tab record);
}