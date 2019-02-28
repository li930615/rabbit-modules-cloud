package com.rabbit.ucenter.mapper;

import com.rabbit.ucenter.model.entity.SysUserRole;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.common.Mapper;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/2/28 21:24
 **/
@CacheNamespace
public interface UserRoleMapper extends Mapper<SysUserRole> {

}
