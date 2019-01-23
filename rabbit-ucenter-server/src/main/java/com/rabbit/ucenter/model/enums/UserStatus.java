package com.rabbit.ucenter.model.enums;

/**
 * 〈账户状态〉
 *
 * @author lzq
 * @date 2019/1/19 15:40
 **/
public enum UserStatus implements BaseEntityEnum<UserStatus> {
    ENABLE(0, "启用"), DISABLE(1, "禁用"), LOCK(2, "锁定");

    @Override
    public int getIntValue() {
        return this.code;
    }

    UserStatus(int code, String description) {
    }

    private int code;
    private String description;

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
