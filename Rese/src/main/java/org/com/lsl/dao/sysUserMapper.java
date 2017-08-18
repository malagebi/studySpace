package org.com.lsl.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.com.lsl.entity.sysUser;

public interface sysUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(sysUser record);

    int insertSelective(sysUser record);

    sysUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(sysUser record);


    int updateByPrimaryKey(sysUser record);
}