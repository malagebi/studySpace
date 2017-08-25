package org.com.lsl.service.impl.user;

import org.com.lsl.dao.sysUserMapper;
import org.com.lsl.entity.UserInfo;
import org.com.lsl.entity.sysUser;
import org.com.lsl.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    private Logger log = LoggerFactory.getLogger(this.getClass());


    // @Autowired
    // private sysUserMapper dao;

    @Override
    public sysUser findById(long id) {
        log.info("long   id---------------");
        // return dao.selectByPrimaryKey(id);
        return null;
    }

    @Override
    public sysUser findByLoginName(String loginName) {
        return null;
    }
}
