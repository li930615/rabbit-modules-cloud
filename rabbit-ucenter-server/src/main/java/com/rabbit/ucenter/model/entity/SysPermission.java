package com.rabbit.ucenter.model.entity;

import java.io.Serializable;

/**
 * @ClassName SysPermission
 * @Description 权限实体对象
 * @Author LZQ
 * @Date 2019/1/19 14:56
 **/
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 5310880992340095131L;

    private String id;//权限ID
    private String name;//权限名称
    private String code;//权限代码
    private String description;//权限描述
    private String parentId;//上级权限ID
    private Integer status;//权限启用状态（默认为0）
    private String appId;//所属应用

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
