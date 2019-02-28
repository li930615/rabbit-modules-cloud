package com.rabbit.ucenter.mapper;

import com.rabbit.ucenter.model.entity.SysRole;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.common.Mapper;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/2/28 19:51
 **/
@CacheNamespace
public interface RoleMapper extends Mapper<SysRole> {


}
