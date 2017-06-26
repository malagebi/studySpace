package org.com.lsl.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.com.lsl.entity.UserInfo;

public interface UserInfoMapper {

    int deleteByPrimaryKey(Long id);


    int insert(UserInfo record);


    int insertSelective(UserInfo record);


    UserInfo selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(UserInfo record);


    int updateByPrimaryKey(UserInfo record);
}