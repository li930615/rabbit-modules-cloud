package com.rabbit.ucenter.model.entity;

import com.rabbit.ucenter.model.enums.UserStatus;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName SysUser
 * @Description 用户实体对象
 * @Author LZQ
 * @Date 2019/1/19 15:02
 **/
public class SysUser implements Serializable {

    private static final long serialVersionUID = 8417035316301812019L;

    private String id;//用户id
    private String userName;//真实姓名
    private Date userBirthday;//出生日期
    private String userAge;//年龄
    private String userSex;//性别：1/男，2/女
    private String maritalStatus;//婚否：1/未婚，2/已婚
    private String nameCode;//姓名简码
    private String userNo;//编号
    private String companyEmile;//公司邮箱
    private String trialStatus;//试用状态：1/试用，2/正式员工
    private Date entryDate;//入职日期
    private Date correctionDate;//转正日期
    private Integer divisionAge;//司龄
    private Integer contractPeriod;//合同年限
    private Date contractTerminationDate;//合同到期时间
    private Integer incumbencyStatus;//在职状态
    private String userDepartmentId;//所属部门ID
    private String userPosition;//职位
    private String wageCard;//工资卡号
    private String userPayment;//薪水
    private String annualLeave;//年休假
    private String socialSecurity;//社保
    private String computerDebit;//电脑借记情况
    private String mortgageLoan;//购房贷款借记情况
    private Integer isTechnician;//是否技术人员
    private String contactWay;//联系方式
    private String detialAddress;//详细住址
    private Date leaveDate;//离职日期
    private String loginName;//登录名
    private String loginPassword;//登录密码
    private String createBy;//创建人
    private Date createDate;//创建时间
    private String updateBy;//修改人
    private Date updateDate;//修改时间
    @ColumnType(jdbcType = JdbcType.INTEGER)
    private UserStatus status;//账号状态

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNameCode() {
        return nameCode;
    }

    public void setNameCode(String nameCode) {
        this.nameCode = nameCode;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getCompanyEmile() {
        return companyEmile;
    }

    public void setCompanyEmile(String companyEmile) {
        this.companyEmile = companyEmile;
    }

    public String getTrialStatus() {
        return trialStatus;
    }

    public void setTrialStatus(String trialStatus) {
        this.trialStatus = trialStatus;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getCorrectionDate() {
        return correctionDate;
    }

    public void setCorrectionDate(Date correctionDate) {
        this.correctionDate = correctionDate;
    }

    public Integer getDivisionAge() {
        return divisionAge;
    }

    public void setDivisionAge(Integer divisionAge) {
        this.divisionAge = divisionAge;
    }

    public Integer getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(Integer contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public Date getContractTerminationDate() {
        return contractTerminationDate;
    }

    public void setContractTerminationDate(Date contractTerminationDate) {
        this.contractTerminationDate = contractTerminationDate;
    }

    public Integer getIncumbencyStatus() {
        return incumbencyStatus;
    }

    public void setIncumbencyStatus(Integer incumbencyStatus) {
        this.incumbencyStatus = incumbencyStatus;
    }

    public String getUserDepartmentId() {
        return userDepartmentId;
    }

    public void setUserDepartmentId(String userDepartmentId) {
        this.userDepartmentId = userDepartmentId;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getWageCard() {
        return wageCard;
    }

    public void setWageCard(String wageCard) {
        this.wageCard = wageCard;
    }

    public String getUserPayment() {
        return userPayment;
    }

    public void setUserPayment(String userPayment) {
        this.userPayment = userPayment;
    }

    public String getAnnualLeave() {
        return annualLeave;
    }

    public void setAnnualLeave(String annualLeave) {
        this.annualLeave = annualLeave;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getComputerDebit() {
        return computerDebit;
    }

    public void setComputerDebit(String computerDebit) {
        this.computerDebit = computerDebit;
    }

    public String getMortgageLoan() {
        return mortgageLoan;
    }

    public void setMortgageLoan(String mortgageLoan) {
        this.mortgageLoan = mortgageLoan;
    }

    public Integer getIsTechnician() {
        return isTechnician;
    }

    public void setIsTechnician(Integer isTechnician) {
        this.isTechnician = isTechnician;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getDetialAddress() {
        return detialAddress;
    }

    public void setDetialAddress(String detialAddress) {
        this.detialAddress = detialAddress;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
