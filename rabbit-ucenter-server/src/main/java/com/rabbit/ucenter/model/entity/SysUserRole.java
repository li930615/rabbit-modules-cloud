package com.rabbit.ucenter.model.entity;

import java.io.Serializable;

/**
 * @ClassName SysUserRole
 * @Description 用户角色表实体对象
 * @Author LZQ
 * @Date 2019/1/19 15:42
 **/
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = -457529927562556381L;

    private String id;
    private String userId;//用户ID
    private String roleId;//用户对应的角色ID
    private String appId;//用户对应的应用ID

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
