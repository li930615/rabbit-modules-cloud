package com.rabbit.ucenter.dao;

import com.rabbit.ucenter.model.entity.SysUser;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/1/23 20:51
 **/
public interface SysUserMapper {

    SysUser login(String loginName, String password);
}
