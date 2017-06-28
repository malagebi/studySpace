package org.com.lsl.service.impl.user;

import org.com.lsl.dao.UserInfoMapper;
import org.com.lsl.entity.UserInfo;
import org.com.lsl.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    private Logger log = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private UserInfoMapper dao;

    @Override
    public UserInfo findById(long id) {
        log.info("long   id---------------");
        return dao.selectByPrimaryKey(id);

    }
}
