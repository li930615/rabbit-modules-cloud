package com.rabbit.ucenter.common.base;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 〈通用接口实现类〉
 *
 * @author lzq
 * @date 2019/1/17 22:51
 **/
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    public void setMapper(Mapper<T> mapper) {
        this.mapper = mapper;
    }

    @Override
    @Transactional(readOnly = true)
    public T get(String o) {
        if (StringUtils.isNotBlank(o)) {
            return mapper.selectByPrimaryKey(o);
        }
        return null;
    }

    @Override
    @Transactional
    public int save(T object) {
        return mapper.insert(object);
    }

    @Override
    @Transactional
    public int update(T object) {
        return mapper.updateByPrimaryKey(object);
    }

    @Override
    @Transactional
    public int delete(T object) {
        return mapper.delete(object);
    }

    @Override
    @Transactional
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<T> getAliiList() {
        return mapper.selectAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<T> getByIds(Class<T> object, String property, List<?> ids) {
        //tk.mybatis的条件查询
        Example example = new Example(object);
        example.createCriteria().andIn(property, ids);
        return mapper.selectByExample(example);
    }
}
