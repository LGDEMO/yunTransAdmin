package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.User_address_tab;

public interface User_address_tabMapper {
    int deleteByPrimaryKey(String addressId);

    int insert(User_address_tab record);

    int insertSelective(User_address_tab record);

    User_address_tab selectByPrimaryKey(String addressId);

    int updateByPrimaryKeySelective(User_address_tab record);

    int updateByPrimaryKey(User_address_tab record);
}