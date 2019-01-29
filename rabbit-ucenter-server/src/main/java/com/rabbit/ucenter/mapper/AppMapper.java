package com.rabbit.ucenter.mapper;

import com.rabbit.ucenter.model.entity.SysApp;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉
 *
 * @author lzq
 * @date 2019/1/20 16:11
 **/
public interface AppMapper extends Mapper<SysApp> {

    /**
     * 根据编码获取应用
     * @param code
     * @return
     */
    List<SysApp> getAppByCode(@Param("code") String code);
}
