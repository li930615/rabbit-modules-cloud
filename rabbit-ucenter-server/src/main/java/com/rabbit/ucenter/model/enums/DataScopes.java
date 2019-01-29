package com.rabbit.ucenter.model.enums;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/1/29 21:20
 **/
public enum DataScopes implements BaseEntityEnum<DataScopes>{

    ALL(1, "所有数据"), DEPANDALL(4, "所在部门及以下数据"), DEP(5, "所在部门数据"), SELF(8, "仅本人数据");

    private int code;
    private String description;

    private DataScopes(int code, String description) { this.code = new Integer(code).intValue();
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
