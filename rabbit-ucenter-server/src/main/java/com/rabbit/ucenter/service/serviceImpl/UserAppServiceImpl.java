package com.rabbit.ucenter.service.serviceImpl;

import com.rabbit.ucenter.mapper.UserAppMapper;
import com.rabbit.ucenter.model.entity.SysApp;
import com.rabbit.ucenter.service.UserAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserAppServiceImpl
 * @Description 用户应用接口实现
 * @Author LZQ
 * @Date 2019/2/28 21:31
 **/
@Service
public class UserAppServiceImpl implements UserAppService {

    @Resource
    private UserAppMapper userAppMapper;

    @Override
    @Cacheable(value = "SysApp_list", key = "'sysApp_list_byUserId_' + #userId")
    public List<SysApp> listByUserId(String userId) {
        return userAppMapper.getAppsByUserId(userId);
    }
}
