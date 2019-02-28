package com.rabbit.ucenter.model.qo;

import com.rabbit.ucenter.model.enums.DataScopes;
import com.rabbit.ucenter.model.enums.FromSystemEnum;
import com.rabbit.ucenter.model.enums.UserStatus;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName UserQo
 * @Description TODO
 * @Author LZQ
 * @Date 2019/1/29 22:11
 **/
public class UserQo implements Serializable {

    private static final long serialVersionUID = -4815652578119718069L;
    private String userId;
    private String[] userIdArr;
    private String loginName;
    private String password;
    private String name;
    private UserStatus status;
    private String roleId;
    private String[] roleIds;
    private String officeId;
    private String openId;
    private FromSystemEnum fromSystem;
    private boolean haveUserListPermission;
    private String[] appIdArr;
    private String appId;
    private Date createTime;
    private Date updateTime;
    private DataScopes dataScope;
    private String oldPassword;
    private String newPasswordOne;
    private String newPasswordTwo;
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

    public String getUserId()
    {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String[] getUserIdArr() {
        return this.userIdArr;
    }

    public void setUserIdArr(String[] userIdArr) {
        this.userIdArr = userIdArr;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserStatus getStatus() {
        return this.status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String[] getRoleIds() {
        return this.roleIds;
    }

    public void setRoleIds(String[] roleIds) {
        this.roleIds = roleIds;
    }

    public String getOfficeId() {
        return this.officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public FromSystemEnum getFromSystem() {
        return this.fromSystem;
    }

    public void setFromSystem(FromSystemEnum fromSystem) {
        this.fromSystem = fromSystem;
    }

    public boolean isHaveUserListPermission() {
        return this.haveUserListPermission;
    }

    public void setHaveUserListPermission(boolean haveUserListPermission) {
        this.haveUserListPermission = haveUserListPermission;
    }

    public String[] getAppIdArr() {
        return this.appIdArr;
    }

    public void setAppIdArr(String[] appIdArr) {
        this.appIdArr = appIdArr;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public DataScopes getDataScope() {
        return this.dataScope;
    }

    public void setDataScope(DataScopes dataScope) {
        this.dataScope = dataScope;
    }

    public String getOldPassword() {
        return this.oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPasswordOne() {
        return this.newPasswordOne;
    }

    public void setNewPasswordOne(String newPasswordOne) {
        this.newPasswordOne = newPasswordOne;
    }

    public String getNewPasswordTwo() {
        return this.newPasswordTwo;
    }

    public void setNewPasswordTwo(String newPasswordTwo) {
        this.newPasswordTwo = newPasswordTwo;
    }

    public static long getSerialVersionUID() {
        return -4815652578119718069L;
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
