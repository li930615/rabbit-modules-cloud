package com.rabbit.ucenter.service;

import com.rabbit.ucenter.model.entity.SysApp;

/**
 * @ClassName AppService
 * @Description 根据编码获取应用
 * @Author LZQ
 * @Date 2019/1/20 16:05
 **/
public interface AppService {

    SysApp getByCode(String appCode);
}
