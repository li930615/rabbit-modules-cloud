package com.rabbit.ucenter.service;

import com.rabbit.ucenter.model.entity.SysRole;

import java.util.List;

/**
 * 〈角色接口〉
 *
 * @author LZQ
 * @date 2019/2/28 19:47
 **/
public interface RoleService {

    List<SysRole> listByUserId(String userId);

    List<SysRole> listAll(Boolean haveAdmin);
}
