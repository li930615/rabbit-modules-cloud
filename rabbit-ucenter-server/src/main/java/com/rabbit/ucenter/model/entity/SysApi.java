package com.rabbit.ucenter.model.entity;

import com.baomidou.mybatisplus.annotations.TableField;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName SysApi
 * @Description API描述
 * @Author LZQ
 * @Date 2019/1/20 15:50
 **/
public class SysApi implements Serializable {

    @Id
    private String id;

    @TableField("name")
    private String name; //接口名称

    @TableField("uri")
    private String uri;//地址

    @TableField("permission")
    private String permission;// 权限表达式

    @TableField("state")
    private String state;//状态

    @Column(name = "seq")
    private int seq;//排序

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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
}
