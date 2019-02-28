package com.rabbit.ucenter.service.serviceImpl;

import com.rabbit.ucenter.mapper.UserRoleMapper;
import com.rabbit.ucenter.model.entity.SysUserRole;
import com.rabbit.ucenter.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserRoleServiceImpl
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/28 21:23
 **/
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    @Cacheable(value = "SysUserRole_list", key = "'sysUserRole_list_byUserId_' + #userId")
    public List<SysUserRole> listByUserId(String userId) {
        Example example = new Example(SysUserRole.class);
        example.createCriteria().andEqualTo("userId", userId);
        return  userRoleMapper.selectByExample(example);
    }
}
