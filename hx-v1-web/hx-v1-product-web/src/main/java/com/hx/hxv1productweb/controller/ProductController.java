package com.hx.hxv1productweb.controller;

import cm.hxv1.productapi.ProductService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.hxv1.entity.Product;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @Author: 吴
 * @Date: 2020/5/12 17:02
 */
@Controller
public class ProductController {
    @Reference
    ProductService productService;
 @RequestMapping("pro")
    @ResponseBody
  public  String index(){
        Product product = (Product) productService.selectByPrimaryKey(2L);
        return product.toString();
    }

    @RequestMapping("pros")
    public String list(Model model){
        List<Product> products = productService.list();
        model.addAttribute("products",products);
        return "product";
    }
    @RequestMapping("product/page/{pageNum}/{pageSize}")
    public String pageList(Model model,
                           @PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize){
        PageInfo<Product> pageInfo =  productService.getPageInfo(pageNum,pageSize);
        model.addAttribute("pageInfo",pageInfo);

        return "product";

    }
}
