package com.rabbit.ucenter.service.serviceImpl;

import com.rabbit.ucenter.common.base.BaseServiceImpl;
import com.rabbit.ucenter.mapper.SysUserMapper;
import com.rabbit.ucenter.model.entity.SysApp;
import com.rabbit.ucenter.model.entity.SysOffice;
import com.rabbit.ucenter.model.entity.SysRole;
import com.rabbit.ucenter.model.entity.SysUser;
import com.rabbit.ucenter.model.enums.DataScopes;
import com.rabbit.ucenter.model.enums.Status;
import com.rabbit.ucenter.model.qo.LoginQo;
import com.rabbit.ucenter.model.vo.SysUserVo;
import com.rabbit.ucenter.service.OfficeService;
import com.rabbit.ucenter.service.RoleService;
import com.rabbit.ucenter.service.SysUserService;
import com.rabbit.ucenter.service.UserAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private OfficeService officeService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserAppService userAppService;

    @Override
    public SysUserVo getSysUserVoById(String userId) {
        SysUser sysUser = sysUserService.getById(userId);
        return toSysUserVo(sysUser);
    }

    @Override
    public SysUser getUserByNameAndPassword(LoginQo loginQo)
    {
        return this.sysUserMapper.getUserByNameAndPassword(loginQo);
    }

    /**
     * 功能描述：转vo对象
     * @author shi.longlong
     * @date 2018/8/10 15:50
     **/
    public SysUserVo toSysUserVo(SysUser sysUser){
        if(sysUser != null){
            SysUserVo sysUserVo = new SysUserVo();
            sysUserVo.setId(sysUser.getId());
            sysUserVo.setLoginName(sysUser.getLoginName());
            sysUserVo.setName(sysUser.getName());
            sysUserVo.setNo(sysUser.getNo());
            sysUserVo.setOfficeId(sysUser.getOfficeId());
            DataScopes dataScopes = sysUser.getDataScope();
            if(dataScopes != null){
                sysUserVo.setDataScopes(SysUserVo.DataScopes.getByCode(dataScopes.getCode()));
            }

            if(sysUser.getOfficeId() != null){
                //获取部门
                SysOffice sysOffice = officeService.getById(sysUser.getOfficeId());
                if (sysOffice != null) {
                    sysUserVo.setOfficeName(sysOffice.getName());
                }
            }
            //查询角色
            List<SysRole> sysRoleList = roleService.listByUserId(sysUser.getId());
            if(sysRoleList != null && sysRoleList.size() > 0){
                List<SysUserVo.Role> roleList = new ArrayList<>();
                for(SysRole sysRole : sysRoleList){
                    SysUserVo.Role role = sysUserVo.new Role();
                    role.setId(sysRole.getId());
                    role.setRoleName(sysRole.getName());
                    roleList.add(role);
                }
                sysUserVo.setRoleList(roleList);
            }
            //查询分配的app
            List<SysApp> sysAppList = userAppService.listByUserId(sysUser.getId());
            if(sysAppList != null && sysAppList.size() > 0){
                List<SysUserVo.App> appList =  new ArrayList<>();
                for(SysApp sysApp : sysAppList){
                    //应用非禁用
                    if(Status.ENABLE == sysApp.getStatus()){
                        SysUserVo.App app = sysUserVo.new App();
                        app.setId(sysApp.getId());
                        app.setAppName(sysApp.getName());
                        app.setCode(sysApp.getCode());
                        app.setUrl(sysApp.getUrl());
                        app.setSort(sysApp.getSort());
                        appList.add(app);
                    }
                }
                sysUserVo.setAppList(appList);
            }
            return sysUserVo;
        }
        return null;
    }

    @Override
    @Cacheable(value = "SysUser", key = "'sysUser_byId_' + #id")
    public SysUser getById(String id){
        return sysUserMapper.getById(id);
    }
}
