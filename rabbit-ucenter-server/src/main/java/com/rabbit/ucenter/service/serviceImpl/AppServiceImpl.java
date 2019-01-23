package com.rabbit.ucenter.service.serviceImpl;

import com.rabbit.ucenter.dao.AppMapper;
import com.rabbit.ucenter.model.entity.SysApp;
import com.rabbit.ucenter.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AppServiceImpl
 * @Description TODO
 * @Author LZQ
 * @Date 2019/1/20 16:10
 **/
@Service
public class AppServiceImpl implements AppService {

    @Autowired
    private AppMapper appMapper;

    @Cacheable(value = "SysApp", key = "'sysApp_ByCode_' + #code")
    public SysApp getByCode(String code) {
        List<SysApp> list = appMapper.getAppByCode(code);
        return (list == null || 0 == list.size()) ? null : list.get(0);
    }
}
