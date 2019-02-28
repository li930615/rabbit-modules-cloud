package com.rabbit.ucenter.service;

import com.rabbit.ucenter.model.entity.SysOffice;

/**
 * 〈部门接口〉
 *
 * @author LZQ
 * @date 2019/2/28 19:40
 **/
public interface OfficeService {

    SysOffice getById(String id);
}
