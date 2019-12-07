package com.yuntransadmin.project.mapper;

import com.yuntransadmin.project.model.Ol_translation_tab;

public interface Ol_translation_tabMapper {
    int deleteByPrimaryKey(Integer translationId);

    int insert(Ol_translation_tab record);

    int insertSelective(Ol_translation_tab record);

    Ol_translation_tab selectByPrimaryKey(Integer translationId);

    int updateByPrimaryKeySelective(Ol_translation_tab record);

    int updateByPrimaryKey(Ol_translation_tab record);
}