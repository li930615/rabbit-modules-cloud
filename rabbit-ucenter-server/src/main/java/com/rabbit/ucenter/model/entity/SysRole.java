package com.rabbit.ucenter.model.entity;

import com.rabbit.ucenter.model.enums.Status;
import io.swagger.annotations.ApiModel;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName SysRole
 * @Description 角色表实体对象
 * @Author LZQ
 * @Date 2019/1/19 15:25
 **/
@ApiModel(value = "SysRole", description = "角色对象")
public class SysRole implements Serializable {

    private static final long serialVersionUID = -4697973230492786177L;

    private String id;
    private String appId;//所属应用ID
    private String name;//角色名称
    private String description;//角色描述
    @ColumnType(jdbcType = JdbcType.INTEGER)
    private Status status;//状态
    private Date createDate;//角色创建时间
    private Date updateDate;//最后修改时间
    private String departmentId;//角色所属部门
    private String roleType;//角色类型
    private String useable;//角色是否可用
    private String enName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getUseable() {
        return useable;
    }

    public void setUseable(String useable) {
        this.useable = useable;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }
}
