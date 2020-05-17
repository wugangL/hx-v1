package com.hx.hxv1produvtservice;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@EnableDubbo
@MapperScan("com.hxv1.mapper")

@SpringBootApplication
public class HxV1ProduvtServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HxV1ProduvtServiceApplication.class, args);
    }

}
