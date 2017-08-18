package org.com.lsl.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.com.lsl.entity.sysRole;

public interface sysRoleMapper {

    int deleteByPrimaryKey(Long roleId);


    int insert(sysRole record);

    int insertSelective(sysRole record);


    sysRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(sysRole record);


    int updateByPrimaryKey(sysRole record);
}