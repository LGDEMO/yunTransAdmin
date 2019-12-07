package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.Purchase_order_tab;

public interface Purchase_order_tabMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Purchase_order_tab record);

    int insertSelective(Purchase_order_tab record);

    Purchase_order_tab selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Purchase_order_tab record);

    int updateByPrimaryKey(Purchase_order_tab record);
}