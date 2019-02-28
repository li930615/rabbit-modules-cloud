package com.rabbit.ucenter.service;

import com.rabbit.ucenter.model.entity.SysUserRole;

import java.util.List;

/**
 * 〈用户角色接口〉
 *
 * @author LZQ
 * @date 2019/2/28 21:22
 **/
public interface UserRoleService {

    List<SysUserRole> listByUserId(String userId);
}
