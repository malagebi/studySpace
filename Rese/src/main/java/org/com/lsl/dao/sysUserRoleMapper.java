package org.com.lsl.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.com.lsl.entity.sysUserRole;

public interface sysUserRoleMapper {

    int deleteByPrimaryKey(Long id);


    int insert(sysUserRole record);

    int insertSelective(sysUserRole record);

    sysUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(sysUserRole record);

    int updateByPrimaryKey(sysUserRole record);
}