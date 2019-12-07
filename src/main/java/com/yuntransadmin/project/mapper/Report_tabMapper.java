package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.Report_tab;

public interface Report_tabMapper {
    int deleteByPrimaryKey(Integer reportId);

    int insert(Report_tab record);

    int insertSelective(Report_tab record);

    Report_tab selectByPrimaryKey(Integer reportId);

    int updateByPrimaryKeySelective(Report_tab record);

    int updateByPrimaryKey(Report_tab record);
}