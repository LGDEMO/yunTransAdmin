package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.Package_tab;

public interface Package_tabMapper {
    int deleteByPrimaryKey(Integer packageId);

    int insert(Package_tab record);

    int insertSelective(Package_tab record);

    Package_tab selectByPrimaryKey(Integer packageId);

    int updateByPrimaryKeySelective(Package_tab record);

    int updateByPrimaryKey(Package_tab record);
}