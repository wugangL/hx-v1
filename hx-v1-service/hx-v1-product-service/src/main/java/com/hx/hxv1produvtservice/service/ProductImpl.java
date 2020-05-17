package com.hx.hxv1produvtservice.service;

import cm.hxv1.productapi.ProductService;
import com.alibaba.dubbo.config.annotation.Service;
import com.hxv1.common.IbaseDao;
import com.hxv1.common.IbaseServiceImpl;
import com.hxv1.entity.Product;
import com.hxv1.mapper.ProductDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 吴
 * @Date: 2020/5/12 16:44
 */
@Component
@Service
public class ProductImpl extends IbaseServiceImpl<Product> implements ProductService<Product> {
    @Resource
    ProductDao productDao;
    @Override
    public IbaseDao getIbaseDao() {
        return productDao;
    }
    public List<Product> list(){
        return productDao.list();
    }
}
