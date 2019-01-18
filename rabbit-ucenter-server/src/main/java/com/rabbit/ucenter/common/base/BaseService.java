package com.rabbit.ucenter.common.base;

import java.util.List;

/**
 * 〈通用接口模板〉
 *
 * @author lzq
 * @date 2019/1/18 11:52
 * @description T表示某一类型，？表示任意类型
 **/
public interface BaseService<T> {

    T get(String o);

    int save(T object);

    int update(T object);

    int delete(T object);

    int deleteByPrimaryKey(String id);

    List<T> getAliiList();

    List<T> getByIds(Class<T> object, String property, List<?> ids);
}
