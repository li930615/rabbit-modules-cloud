package com.rabbit.ucenter.model.qo;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * @ClassName LoginQo
 * @Description TODO
 * @Author LZQ
 * @Date 2019/1/29 21:26
 **/
public class LoginQo implements Serializable {

    private static final long serialVersionUID = -4830309263466309037L;

    @NotEmpty
    private String loginName;

    @NotEmpty
    private String password;
    private String rememberMe;
    private String code;
    private boolean openVerifyCode;
    private boolean openAjaxLogin;

    public String getUserName() {
        return this.loginName;
    }

    public void setUserName(String loginName) {
        this.loginName = loginName;
    }

    public boolean getOpenAjaxLogin()
    {
        return this.openAjaxLogin;
    }

    public void setOpenAjaxLogin(boolean openAjaxLogin) {
        this.openAjaxLogin = openAjaxLogin;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean getOpenVerifyCode() {
        return this.openVerifyCode;
    }

    public void setOpenVerifyCode(boolean openVerifyCode) {
        this.openVerifyCode = openVerifyCode;
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

    public String getRememberMe() {
        return this.rememberMe;
    }

    public void setRememberMe(String rememberMe) {
        this.rememberMe = rememberMe;
    }
}
