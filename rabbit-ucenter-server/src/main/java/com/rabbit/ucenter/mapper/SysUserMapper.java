package com.rabbit.ucenter.mapper;

import com.rabbit.ucenter.model.vo.SysUserVo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/1/23 20:51
 **/
public interface SysUserMapper extends Mapper<SysUserVo> {

    SysUserVo login(@Param("loginName")String loginName, @Param("password")String password);
}
