package com.rabbit.ucenter.model.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.rabbit.common.entity.CurrentUser;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName SysLicense
 * @Description 第三方应用许可证
 * @Author LZQ
 * @Date 2019/1/20 15:53
 **/
public class SysLicense implements Serializable {

    private static final long serialVersionUID = 735502960369271054L;
    @Id
    private String id;

    @TableField("app_id")
    private String appId;

    @TableField("app_secret")
    private String appSecret;//密钥

    @TableField("app_name")
    private String appName;//应用名称

    @Transient
    private String checkType;//检查类型

    @TableField("state")
    private String state; //状态

    @Column(name = "seq")
    private int seq; //排序

    @TableField("description")
    private String description;   //描述

    @TableField("create_by")
    private String createBy;            // 创建人

    @TableField("update_by")
    private String updateBy;            // 修改人

    @TableField("create_time")
    private Date createTime;    // 创建时间

    @TableField("update_time")
    private Date updateTime; //更新时间


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

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void preInsert(CurrentUser currentUser){
        this.createBy = currentUser.getId();
        this.updateBy = currentUser.getId();
        this.createTime = new Date();
        this.updateTime = new Date();
    }


    public void preUpdate(CurrentUser currentUser){
        this.updateBy = currentUser.getId();
        this.updateTime = new Date();
    }
}
