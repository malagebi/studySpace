package org.com.lsl.entity;

import java.io.Serializable;

public class UserInfo implements Serializable{

    private Long id;


    private String userName;


    private String pwd;

    public UserInfo() {
    }

    public UserInfo(Long id, String userName, String pwd) {
        this.id = id;
        this.userName = userName;
        this.pwd = pwd;
    }


    public Long getId() {
        return id;
    }


    public String getUserName() {
        return userName;
    }


    public String getPwd() {
        return pwd;
    }
}