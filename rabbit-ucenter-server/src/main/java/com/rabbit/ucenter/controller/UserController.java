package com.rabbit.ucenter.controller;

import com.rabbit.common.util.R;
import com.rabbit.ucenter.model.enums.UserStatus;
import com.rabbit.ucenter.model.vo.SysUserVo;
import com.rabbit.ucenter.service.SysUserService;
import io.swagger.annotations.Api;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @ResponseBody
    @RequestMapping({"/getSysUserVoByLogin"})
    public R login( @RequestParam("loginName")String loginName, @RequestParam("password")String password) {
        if (StringUtils.isBlank(loginName) || StringUtils.isBlank(password)) {
            return new R(new Exception("用户名或密码为空"));
        }
        SysUserVo userVo = sysUserService.login(loginName, password);
        if (userVo == null) {
            return new R(new Exception("用户名或密码错误"));
        }
        if (userVo.getStatus() == UserStatus.LOCK) {
            return new R(new Exception("Account :" + userVo.getLoginName() + "被锁定"));
        }
        if (userVo.getStatus() == UserStatus.DISABLE) {
            return new R(new Exception("Account:" + userVo.getLoginName() + "被禁用"));
        }
        return new R(userVo);
    }
}
