package com.rabbit.ucenter.service;

import com.rabbit.ucenter.model.vo.SysUserVo;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/1/20 16:16
 **/
public interface SysUserService {

    SysUserVo getSysUserVoById(String userId);

    SysUserVo getSysUserVoByLoginName(String loginName);
}
