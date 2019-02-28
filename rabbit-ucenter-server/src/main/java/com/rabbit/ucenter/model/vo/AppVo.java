package com.rabbit.ucenter.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rabbit.ucenter.model.enums.Status;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName AppVo
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/28 22:30
 **/
public class AppVo implements Serializable {

    private static final long serialVersionUID = 851019162980632315L;

    private String id;

    private String name;        // 应用名

    private Status status;      // 应用状态

    @Column(name = "sort")
    private int sort;           // 应用排序

    private String code;        // 应用编码

    private String url;         // 应用地址

    private String secret;       //密钥

    private String statusName;  // 应用状态描述

    private String permission; //应用权限

    private Date createTime;

    private Date updateTime;

    private Boolean checked;

    private Integer sumAppAll;
    private Integer sumAppDay;
    private Integer sumAppLastDay;
    private Integer sumAppMonth;
    private Integer sumAppWeek;

    public Integer getSumAppAll() {
        return sumAppAll;
    }

    public void setSumAppAll(Integer sumAppAll) {
        this.sumAppAll = sumAppAll;
    }

    public Integer getSumAppDay() {
        return sumAppDay;
    }

    public void setSumAppDay(Integer sumAppDay) {
        this.sumAppDay = sumAppDay;
    }

    public Integer getSumAppLastDay() {
        return sumAppLastDay;
    }

    public void setSumAppLastDay(Integer sumAppLastDay) {
        this.sumAppLastDay = sumAppLastDay;
    }

    public Integer getSumAppMonth() {
        return sumAppMonth;
    }

    public void setSumAppMonth(Integer sumAppMonth) {
        this.sumAppMonth = sumAppMonth;
    }

    public Integer getSumAppWeek() {
        return sumAppWeek;
    }

    public void setSumAppWeek(Integer sumAppWeek) {
        this.sumAppWeek = sumAppWeek;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getStatusName() {
        return status.getDescription();
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
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

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
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
