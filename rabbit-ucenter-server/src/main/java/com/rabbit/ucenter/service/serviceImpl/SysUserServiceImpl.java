package com.rabbit.ucenter.service.serviceImpl;

import com.rabbit.ucenter.common.base.BaseServiceImpl;
import com.rabbit.ucenter.mapper.SysUserMapper;
import com.rabbit.ucenter.model.entity.SysUser;
import com.rabbit.ucenter.model.qo.LoginQo;
import com.rabbit.ucenter.model.vo.SysUserVo;
import com.rabbit.ucenter.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @ClassName SysUserServiceImpl
 * @Description TODO
 * @Author LZQ
 * @Date 2019/1/20 16:20
 **/
@Service("userServiceImpl")
@Transactional(rollbackFor = Exception.class,readOnly = true)
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserVo getSysUserVoById(String userId) {
        return null;
    }

    @Override
    public SysUser getUserByNameAndPassword(LoginQo loginQo)
    {
        return this.sysUserMapper.getUserByNameAndPassword(loginQo);
    }
}
