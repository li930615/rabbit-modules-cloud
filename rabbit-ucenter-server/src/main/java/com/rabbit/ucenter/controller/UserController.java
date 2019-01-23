package com.rabbit.ucenter.controller;

import com.rabbit.ucenter.service.SysUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserController
 * @Description 用户Controller
 * @Author LZQ
 * @Date 2019/1/23 20:39
 **/

@Controller
@Api(value = "用户controller", tags = "用户接口")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SysUserService sysUserService;


}
