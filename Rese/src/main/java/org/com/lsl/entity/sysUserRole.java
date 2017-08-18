package org.com.lsl.entity;

public class sysUserRole {
    private Long id;

    private String sysUserId;

    private String sysRoleId;

    public sysUserRole(Long id, String sysUserId, String sysRoleId) {
        this.id = id;
        this.sysUserId = sysUserId;
        this.sysRoleId = sysRoleId;
    }

    public sysUserRole() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId == null ? null : sysUserId.trim();
    }

    public String getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(String sysRoleId) {
        this.sysRoleId = sysRoleId == null ? null : sysRoleId.trim();
    }
}