package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.Gquery_tab;

public interface Gquery_tabMapper {
    int deleteByPrimaryKey(Integer gqId);

    int insert(Gquery_tab record);

    int insertSelective(Gquery_tab record);

    Gquery_tab selectByPrimaryKey(Integer gqId);

    int updateByPrimaryKeySelective(Gquery_tab record);

    int updateByPrimaryKey(Gquery_tab record);
}