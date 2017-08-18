package org.com.lsl.entity;

public class sysRolePermission {
    private String id;

    private String sysRoleId;

    private String sysPermissionId;

    public sysRolePermission(String id, String sysRoleId, String sysPermissionId) {
        this.id = id;
        this.sysRoleId = sysRoleId;
        this.sysPermissionId = sysPermissionId;
    }

    public sysRolePermission() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(String sysRoleId) {
        this.sysRoleId = sysRoleId == null ? null : sysRoleId.trim();
    }

    public String getSysPermissionId() {
        return sysPermissionId;
    }

    public void setSysPermissionId(String sysPermissionId) {
        this.sysPermissionId = sysPermissionId == null ? null : sysPermissionId.trim();
    }
}