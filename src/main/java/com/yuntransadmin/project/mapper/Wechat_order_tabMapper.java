package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.Wechat_order_tab;

public interface Wechat_order_tabMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Wechat_order_tab record);

    int insertSelective(Wechat_order_tab record);

    Wechat_order_tab selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Wechat_order_tab record);

    int updateByPrimaryKey(Wechat_order_tab record);
}