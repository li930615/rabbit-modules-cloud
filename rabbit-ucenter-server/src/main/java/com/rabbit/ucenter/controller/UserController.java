package com.rabbit.ucenter.controller;

import com.rabbit.common.util.R;
import com.rabbit.ucenter.model.entity.SysUser;
import com.rabbit.ucenter.model.enums.UserStatus;
import com.rabbit.ucenter.model.qo.LoginQo;
import com.rabbit.ucenter.service.SysUserService;
import com.rabbit.ucenter.util.Md5Util;
import io.swagger.annotations.Api;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName UserController
 * @Description 用户Controller
 * @Author LZQ
 * @Date 2019/1/23 20:39
 **/

@Controller
@Api(value = "用户controller", tags = "用户接口")
@RequestMapping({"/user"})
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping({"/getSysUserVoByLogin"})
    @ResponseBody
    public Object getSysUserVoByLogin(String loginName, String password) {
        if (org.apache.commons.lang.StringUtils.isBlank(loginName) || StringUtils.isBlank(password)) {
            return new R(new Exception("用户名或密码为空"));
        }
        String md5OldPwd = Md5Util.getMD5(password);
        LoginQo loginQo = new LoginQo();
        loginQo.setLoginName(loginName);
        loginQo.setPassword(md5OldPwd);
        SysUser sysUser = sysUserService.getUserByNameAndPassword(loginQo);
        if (sysUser == null) {
            return new R(new Exception("用户名或密码错误"));
        }
        if (UserStatus.LOCK == sysUser.getStatus()) {
            return new R(new Exception("用户[" + sysUser.getName() + "]被锁定"));
        } else if (UserStatus.DISABLE == sysUser.getStatus()) {
            return new R(new Exception("用户[" + sysUser.getName() + "]被禁用"));
        }
        return new R(sysUserService.getSysUserVoById(sysUser.getId()));
    }
}
