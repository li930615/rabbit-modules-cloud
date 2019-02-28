package com.rabbit.ucenter.service;

import com.rabbit.ucenter.common.base.BaseService;
import com.rabbit.ucenter.model.entity.SysUser;
import com.rabbit.ucenter.model.qo.LoginQo;
import com.rabbit.ucenter.model.vo.SysUserVo;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/1/20 16:16
 **/
public interface SysUserService extends BaseService<SysUser> {

    SysUserVo getSysUserVoById(String userId);

    SysUser getUserByNameAndPassword(LoginQo paramLoginQo);
}
