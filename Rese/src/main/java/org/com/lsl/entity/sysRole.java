package org.com.lsl.entity;

public class sysRole {
    private Long roleId;

    private String name;

    private String available;

    public sysRole(Long roleId, String name, String available) {
        this.roleId = roleId;
        this.name = name;
        this.available = available;
    }

    public sysRole() {
        super();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }
}