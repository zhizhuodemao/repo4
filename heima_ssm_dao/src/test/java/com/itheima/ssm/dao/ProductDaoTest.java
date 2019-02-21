package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Items;
import com.itheima.ssm.domain.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProductDaoTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        ProductDao bean = context.getBean(ProductDao.class);
//        List<Items> mysql = bean.findMysql();
        List<Product> all = bean.findAll();
//        System.out.println(mysql);
        System.out.println(all);
    }
}
