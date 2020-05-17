package com.hxv1.common;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author: 吴
 * @Date: 2020/5/12 15:57
 */

public abstract class IbaseServiceImpl<T> implements IbaseService<T> {
    public abstract IbaseDao getIbaseDao();

    public int deleteByPrimaryKey(Long id) {
        return getIbaseDao().deleteByPrimaryKey(id);

    }

    public int insert(T record) {
        return getIbaseDao().insert(record);
    }

    public int insertSelective(T record) {
        return getIbaseDao().insertSelective(record);
    }

    public T selectByPrimaryKey(Long id) {
        return (T) getIbaseDao().selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(T record) {
        return getIbaseDao().updateByPrimaryKeySelective(record);

    }

    public int updateByPrimaryKey(T record) {
       return getIbaseDao().updateByPrimaryKey(record);
    }
    public List<T> list(){
        return getIbaseDao().list();
    }


    public PageInfo<T> getPageInfo(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<T> list= list();
        PageInfo<T> pageInfo = new PageInfo<T>(list,4);
        return pageInfo;
    }

}