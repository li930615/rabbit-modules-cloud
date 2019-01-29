package com.rabbit.ucenter.model.entity;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

/**
 * @ClassName SysOffice
 * @Description TODO
 * @Author LZQ
 * @Date 2019/1/29 21:17
 **/
public class SysOffice {

    @Id
    private String id;
    private String name;
    private String parentId;
    private String code;
    private String type;
    private String delFlag;
    private String grade;

    @Transient
    private List<SysOffice> subOffice;

    public String getId()
    {
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

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public List<SysOffice> getSubOffice() {
        return this.subOffice;
    }

    public void setSubOffice(List<SysOffice> subOffice) {
        this.subOffice = subOffice;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
