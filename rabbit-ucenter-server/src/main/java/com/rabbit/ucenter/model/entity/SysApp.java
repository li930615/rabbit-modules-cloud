package com.rabbit.ucenter.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rabbit.ucenter.model.enums.Status;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName SysApp
 * @Description 应用实体类
 * @Author LZQ
 * @Date 2019/1/20 15:51
 **/
public class SysApp implements Serializable {

    private static final long serialVersionUID = -6836959430228135889L;

    @Id
    private String id;      //id

    private String name;    // 应用名

    @ColumnType(jdbcType = JdbcType.INTEGER)
    private Status status;  // 应用状态，启用或者禁用

    private String code;    // 应用编码

    private String url;     // 应用地址

    private String secret;

    private String permission;//应用权限

    @Column(name = "sort")
    private int sort;       // 排序

    private Date createTime;

    private Date updateTime;

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
