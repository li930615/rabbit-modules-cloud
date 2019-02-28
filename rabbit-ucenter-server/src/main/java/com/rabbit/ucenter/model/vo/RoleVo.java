package com.rabbit.ucenter.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rabbit.ucenter.model.enums.Status;

import java.util.Date;

/**
 * @ClassName RoleVo
 * @Description TODO
 * @Author LZQ
 * @Date 2019/1/29 21:43
 **/
public class RoleVo {

    private static final long serialVersionUID = 763228346704155487L;
    private String id;
    private String name;
    private String officeId;
    private String officeName;
    private String description;
    private Status status;
    private Date updateTime;
    private Date createTime;
    private String statusName;
    private boolean checked;
    private Integer sumRoleAll;
    private Integer sumRoleDay;
    private Integer sumRoleLastDay;
    private Integer sumRoleMonth;
    private Integer sumRoleWeek;

    public String getOfficeId()
    {
        return this.officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getOfficeName() {
        return this.officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public Integer getSumRoleAll() {
        return this.sumRoleAll;
    }

    public void setSumRoleAll(Integer sumRoleAll) {
        this.sumRoleAll = sumRoleAll;
    }

    public Integer getSumRoleDay() {
        return this.sumRoleDay;
    }

    public void setSumRoleDay(Integer sumRoleDay) {
        this.sumRoleDay = sumRoleDay;
    }

    public Integer getSumRoleLastDay() {
        return this.sumRoleLastDay;
    }

    public void setSumRoleLastDay(Integer sumRoleLastDay) {
        this.sumRoleLastDay = sumRoleLastDay;
    }

    public Integer getSumRoleMonth() {
        return this.sumRoleMonth;
    }

    public void setSumRoleMonth(Integer sumRoleMonth) {
        this.sumRoleMonth = sumRoleMonth;
    }

    public Integer getSumRoleWeek() {
        return this.sumRoleWeek;
    }

    public void setSumRoleWeek(Integer sumRoleWeek) {
        this.sumRoleWeek = sumRoleWeek;
    }
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatusName() {
        return this.status.getDescription();
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public static long getSerialVersionUID() {
        return 763228346704155487L;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
