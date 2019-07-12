package io.dy.checkinout.dao;

import io.dy.checkinout.po.User_detail;

public interface User_detailMapper {
    int deleteByPrimaryKey(String openid);

    int insert(User_detail record);

    int insertSelective(User_detail record);

    User_detail selectByPrimaryKey(String openid);

    int updateByPrimaryKeySelective(User_detail record);

    int updateByPrimaryKey(User_detail record);
}