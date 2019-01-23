package com.rabbit.ucenter.model.entity;

import java.io.Serializable;

/**
 * @ClassName SysLicenseApi
 * @Description 第三方应用与资源关系
 * @Author LZQ
 * @Date 2019/1/20 15:55
 **/
public class SysLicenseApi implements Serializable {

    private String id;

    private String sysLicenseId;//应用许可id

    private String sysApiId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSysApiId() {
        return sysApiId;
    }

    public void setSysApiId(String sysApiId) {
        this.sysApiId = sysApiId;
    }

    public String getSysLicenseId() {
        return sysLicenseId;
    }

    public void setSysLicenseId(String sysLicenseId) {
        this.sysLicenseId = sysLicenseId;
    }
}
