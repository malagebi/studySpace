package org.com.lsl.service;

import org.com.lsl.entity.UserInfo;
import org.com.lsl.entity.sysUser;


public interface UserInfoService {

    UserInfo findById(long id);

    sysUser findByLoginName(String loginName);
}
