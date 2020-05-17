package com.hx.hxv1produvtservice.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;


/**
 * @Author: 吴
 * @Date: 2020/5/14 10:14
 */
@Configuration
public class PageConfig {
    @Bean
    public PageHelper getPageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties p= new Properties();
        p.setProperty("dialect","mysql");
        p.setProperty("reasonable","true");
        pageHelper.setProperties(p);
        return pageHelper;

    }
}
