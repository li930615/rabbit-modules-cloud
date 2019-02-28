package com.rabbit.ucenter.model.entity;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName SysReUserApp
 * @Description 用户应用实体
 * @Author LZQ
 * @Date 2019/2/28 22:19
 **/
public class SysReUserApp implements Serializable {

    private static final long serialVersionUID = 6687504567651934180L;

    @Id
    private String id;// 自增id

    private String userId;// 用户id

    private String appId;// 应用id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
