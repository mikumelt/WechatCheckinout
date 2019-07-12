package io.dy.checkinout.dao;

import io.dy.checkinout.po.Check_record;

public interface Check_recordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Check_record record);

    int insertSelective(Check_record record);

    Check_record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Check_record record);

    int updateByPrimaryKey(Check_record record);
}