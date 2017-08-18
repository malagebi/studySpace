package org.com.lsl.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.com.lsl.entity.sysRolePermission;

public interface sysRolePermissionMapper {

    int deleteByPrimaryKey(String id);


    int insert(sysRolePermission record);

    int insertSelective(sysRolePermission record);


    sysRolePermission selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(sysRolePermission record);


    int updateByPrimaryKey(sysRolePermission record);
}