package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.Order_status_dict;

public interface Order_status_dictMapper {
    int insert(Order_status_dict record);

    int insertSelective(Order_status_dict record);
}