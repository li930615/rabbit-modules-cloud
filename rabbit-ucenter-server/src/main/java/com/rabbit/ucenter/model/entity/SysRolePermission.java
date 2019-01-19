package com.rabbit.ucenter.model.entity;

import java.io.Serializable;

/**
 * @ClassName SysRolePermission
 * @Description 角色权限表实体对象
 * @Author LZQ
 * @Date 2019/1/19 15:44
 **/
public class SysRolePermission implements Serializable {

    private static final long serialVersionUID = 6585552119085351995L;

    private String id;
    private String roleId;//权限对应的角色id
    private String permissionId;//权限id
    private String appId;//权限对应的应用ID

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
