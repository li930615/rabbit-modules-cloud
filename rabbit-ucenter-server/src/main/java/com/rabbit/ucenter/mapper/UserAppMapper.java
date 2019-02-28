package com.rabbit.ucenter.mapper;

import com.rabbit.ucenter.model.entity.SysApp;
import com.rabbit.ucenter.model.entity.SysReUserApp;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 〈用户App持久层接口〉
 *
 * @author LZQ
 * @date 2019/2/28 21:32
 **/
@CacheNamespace
public interface UserAppMapper extends Mapper<SysReUserApp> {

    List<SysApp> getAppsByUserId(@Param("userId") String userId);
}
