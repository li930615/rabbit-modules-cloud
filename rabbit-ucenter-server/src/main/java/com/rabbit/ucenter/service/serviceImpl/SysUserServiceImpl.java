package com.rabbit.ucenter.service.serviceImpl;

import com.rabbit.ucenter.common.base.BaseServiceImpl;
import com.rabbit.ucenter.mapper.SysUserMapper;
import com.rabbit.ucenter.model.entity.SysUser;
import com.rabbit.ucenter.model.vo.SysUserVo;
import com.rabbit.ucenter.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName SysUserServiceImpl
 * @Description TODO
 * @Author LZQ
 * @Date 2019/1/20 16:20
 **/
@Service
@Transactional(rollbackFor = Exception.class,readOnly = true)
public class SysUserServiceImpl extends BaseServiceImpl<SysUserVo> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserVo getSysUserVoById(String userId) {
        return null;
    }

    @Override
    public SysUserVo getSysUserVoByLoginName(String loginName) {
        return null;
    }

    @Override
    public SysUserVo login( String loginName, String password) {
        return sysUserMapper.login(loginName, password);
    }
}
