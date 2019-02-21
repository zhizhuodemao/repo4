package com.itheima.ssm.controller;

import com.itheima.ssm.dao.ProductDao;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Product> products = productService.findAll();
        System.out.println(products);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("products",products);
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
