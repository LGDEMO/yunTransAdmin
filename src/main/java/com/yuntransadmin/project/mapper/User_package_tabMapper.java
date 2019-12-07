package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.User_package_tab;

public interface User_package_tabMapper {
    int deleteByPrimaryKey(String userPackageId);

    int insert(User_package_tab record);

    int insertSelective(User_package_tab record);

    User_package_tab selectByPrimaryKey(String userPackageId);

    int updateByPrimaryKeySelective(User_package_tab record);

    int updateByPrimaryKey(User_package_tab record);
}