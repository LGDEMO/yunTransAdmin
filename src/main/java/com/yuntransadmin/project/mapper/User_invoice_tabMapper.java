package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.User_invoice_tab;

public interface User_invoice_tabMapper {
    int deleteByPrimaryKey(String invoiceId);

    int insert(User_invoice_tab record);

    int insertSelective(User_invoice_tab record);

    User_invoice_tab selectByPrimaryKey(String invoiceId);

    int updateByPrimaryKeySelective(User_invoice_tab record);

    int updateByPrimaryKey(User_invoice_tab record);
}