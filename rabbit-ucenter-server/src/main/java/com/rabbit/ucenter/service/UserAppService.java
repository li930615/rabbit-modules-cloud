package com.rabbit.ucenter.service;

import com.rabbit.ucenter.model.entity.SysApp;

import java.util.List;

/**
 * 〈用户应用接口〉
 *
 * @author LZQ
 * @date 2019/2/28 21:30
 **/
public interface UserAppService {

    List<SysApp> listByUserId(String userId);
}
