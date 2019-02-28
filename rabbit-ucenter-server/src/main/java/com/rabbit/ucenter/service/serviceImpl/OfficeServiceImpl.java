package com.rabbit.ucenter.service.serviceImpl;

import com.rabbit.ucenter.mapper.OfficeMapper;
import com.rabbit.ucenter.model.entity.SysOffice;
import com.rabbit.ucenter.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName OfficeServiceImpl
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/28 19:42
 **/
@Service
public class OfficeServiceImpl implements OfficeService {

    @Resource
    private OfficeMapper officeMapper;

    @Override
    @Cacheable(value = "SysOffice", key = "'sysOffice_byId_' + #id")
    public SysOffice getById(String id) {
        return officeMapper.selectByPrimaryKey(id);
    }
}
