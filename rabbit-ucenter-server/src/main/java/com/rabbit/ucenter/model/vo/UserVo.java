package com.rabbit.ucenter.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rabbit.ucenter.model.enums.FromSystemEnum;
import com.rabbit.ucenter.model.enums.UserStatus;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName UserVo
 * @Description TODO
 * @Author LZQ
 * @Date 2019/1/29 21:41
 **/
public class UserVo implements Serializable {

    private static final long serialVersionUID = 851019162980632315L;
    private String userId;
    private String loginName;
    private String name;
    private String roleName;
    private UserStatus status;
    private String statusName;
    private String officeId;
    private String officeName;
    private FromSystemEnum fromSystem;
    private String fromSystemName;
    private Date createTime;
    private Date updateTime;
    private String dataScope;
    private String no;
    private String email;
    private String phone;
    private String mobile;
    private String photo;
    private String loginIp;
    private String loginDate;
    private String loginFlag;
    private String createBy;
    private Date createDate;
    private String updateBy;
    private Date updateDate;
    private String qrcode;
    private String sign;
    private Integer sumUserAll;
    private Integer sumUserDay;
    private Integer sumUserLastDay;
    private Integer sumUserMonth;
    private Integer sumUserWeek;

    public Integer getSumUserAll()
    {
        return this.sumUserAll;
    }

    public void setSumUserAll(Integer sumUserAll) {
        this.sumUserAll = sumUserAll;
    }

    public Integer getSumUserDay() {
        return this.sumUserDay;
    }

    public void setSumUserDay(Integer sumUserDay) {
        this.sumUserDay = sumUserDay;
    }

    public Integer getSumUserLastDay() {
        return this.sumUserLastDay;
    }

    public void setSumUserLastDay(Integer sumUserLastDay) {
        this.sumUserLastDay = sumUserLastDay;
    }

    public Integer getSumUserMonth() {
        return this.sumUserMonth;
    }

    public void setSumUserMonth(Integer sumUserMonth) {
        this.sumUserMonth = sumUserMonth;
    }

    public Integer getSumUserWeek() {
        return this.sumUserWeek;
    }

    public void setSumUserWeek(Integer sumUserWeek) {
        this.sumUserWeek = sumUserWeek;
    }

    public static long getSerialVersionUID() {
        return 851019162980632315L;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public UserStatus getStatus() {
        return this.status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getOfficeId() {
        return this.officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getStatusName() {
        return this.statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public FromSystemEnum getFromSystem() {
        return this.fromSystem;
    }

    public void setFromSystem(FromSystemEnum fromSystem) {
        this.fromSystem = fromSystem;
    }

    public String getFromSystemName() {
        return this.fromSystemName;
    }

    public void setFromSystemName(String fromSystemName) {
        this.fromSystemName = fromSystemName;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    public Date getUpdateTime() {
        return this.updateTime;
    }

    public String getOfficeName() {
        return this.officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDataScope() {
        return this.dataScope;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNo() {
        return this.no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLoginIp() {
        return this.loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginDate() {
        return this.loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginFlag() {
        return this.loginFlag;
    }

    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag;
    }

    public String getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getQrcode() {
        return this.qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
