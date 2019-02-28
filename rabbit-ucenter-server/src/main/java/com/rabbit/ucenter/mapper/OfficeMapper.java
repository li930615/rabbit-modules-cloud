package com.rabbit.ucenter.mapper;

import com.rabbit.ucenter.model.entity.SysOffice;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * 〈部门持久层接口〉
 *
 * @author LZQ
 * @date 2019/2/28 19:43
 **/
@CacheNamespace
public interface OfficeMapper extends Mapper<SysOffice> {

    SysOffice getById (@Param("id") String id);
}
