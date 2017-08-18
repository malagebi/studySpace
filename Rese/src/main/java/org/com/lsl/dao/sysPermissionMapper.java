package org.com.lsl.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.com.lsl.entity.sysPermission;

public interface sysPermissionMapper {

    int deleteByPrimaryKey(Long permId);


    int insert(sysPermission record);

    int insertSelective(sysPermission record);


    sysPermission selectByPrimaryKey(Long permId);

    int updateByPrimaryKeySelective(sysPermission record);


    int updateByPrimaryKey(sysPermission record);
}