package com.rabbit.ucenter.model.entity;


import java.io.Serializable;
import java.util.List;

/**
 * @ClassName SysDepartment
 * @Description 部门实体对象
 * @Author LZQ
 * @Date 2019/1/19 14:26
 **/
public class SysDepartment implements Serializable {

    private String id;//部门id
    private String deptName;//部门名称
    private String parentId;//上级部门ID
    private String deptCode;//部门编码
    private String type;//部门类型
    private String delFlag;//删除标记
    private String grade;//机构等级
    private List<SysDepartment> subDepartment;//下级部门

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<SysDepartment> getSubDepartment() {
        return subDepartment;
    }

    public void setSubDepartment(List<SysDepartment> subDepartment) {
        this.subDepartment = subDepartment;
    }
}
