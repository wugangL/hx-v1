package com.hxv1.common;

import com.github.pagehelper.PageInfo;
import com.hxv1.entity.Product;

import java.util.List;

/**
 * @Author: 吴
 * @Date: 2020/5/12 15:56
 */

public interface IbaseService<T> {
    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
    List<T> list();
    PageInfo<T> getPageInfo(int pageNum, int pageSize);
}
