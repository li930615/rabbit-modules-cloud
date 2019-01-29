package com.rabbit.ucenter.model.enums;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/1/29 21:22
 **/
public enum FromSystemEnum implements BaseEntityEnum<FromSystemEnum>{

    DEFAULT_CURRENT_USER_CENTER(0, "用户中心系统");

    private int code;
    private String description;

    private FromSystemEnum(int code, String description) { this.code = new Integer(code).intValue();
        this.description = description;
    }

    public int getCode()
    {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public int getIntValue()
    {
        return this.code;
    }
}
