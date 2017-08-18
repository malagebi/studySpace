package org.com.lsl.entity;

import java.io.Serializable;

public class sysUser implements Serializable {
    private Long userId;

    private String loginName;

    private String userName;

    private String password;

    private String salt;

    private Byte locked;

    public sysUser(Long userId, String loginName, String userName, String password, String salt, Byte locked) {
        this.userId = userId;
        this.loginName = loginName;
        this.userName = userName;
        this.password = password;
        this.salt = salt;
        this.locked = locked;
    }

    public sysUser() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }
}