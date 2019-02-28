package com.rabbit.ucenter.service.serviceImpl;

import com.rabbit.ucenter.mapper.RoleMapper;
import com.rabbit.ucenter.model.entity.SysRole;
import com.rabbit.ucenter.model.entity.SysUserRole;
import com.rabbit.ucenter.service.RoleService;
import com.rabbit.ucenter.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName RoleServiceImpl
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/28 19:48
 **/
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserRoleService userRoleService;

    @Override
    public List<SysRole> listByUserId(String userId) {
        List<SysUserRole> sysUserRoleList = userRoleService.listByUserId(userId);
        if(sysUserRoleList != null && sysUserRoleList.size() > 0){
            List<SysRole> sysRoles = new ArrayList<>();
            Map<String, SysRole> sysRoleMap = roleService.listAll(true).stream().collect(Collectors.toMap(SysRole::getId, sysRole -> sysRole));
            for(SysUserRole sysUserRole : sysUserRoleList){
                SysRole sysRole = sysRoleMap.get(sysUserRole.getRoleId());
                if(sysRole != null){
                    sysRoles.add(sysRole);
                }
            }
            return sysRoles;
        }
        return null;
    }


    @Override
    @Cacheable(value = "SysRole_list", key = "'sysRole_list_byhaveAdmin_' + #haveAdmin")
    public List<SysRole> listAll(Boolean haveAdmin) {
        if(haveAdmin){
            return roleMapper.selectAll();
        }
        Example example = new Example(SysRole.class);
        example.createCriteria().andNotEqualTo("id", "1");
        return roleMapper.selectByExample(example);
    }
}
