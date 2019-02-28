package com.rabbit.ucenter.mapper;

import com.rabbit.ucenter.model.Pager;
import com.rabbit.ucenter.model.entity.SysUser;
import com.rabbit.ucenter.model.qo.LoginQo;
import com.rabbit.ucenter.model.qo.UserQo;
import com.rabbit.ucenter.model.vo.UserVo;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/1/23 20:51
 **/
@CacheNamespace
public interface SysUserMapper extends Mapper<SysUser> {

    SysUser getUserByNameAndPassword(LoginQo paramLoginQo);

    List<UserVo> getUserList(@Param("userQo") UserQo paramUserQo, @Param("pager") Pager<UserVo> paramPager);

    SysUser getById(String id);


}
