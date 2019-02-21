package com.itheima.ssm.service.test;

import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.Impl.ProductServiceImpl;
import com.itheima.ssm.service.Impl.TestServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ServiceTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-service.xml");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.itheima.ssm.service.Impl");
        ProductServiceImpl service = (ProductServiceImpl) context.getBean("productService");
        List<Product> all = service.findAll();
        System.out.println(all);
    }
    @Test
    public void test02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-service.xml");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.itheima.ssm.service.Impl");
        TestServiceImpl service = context.getBean("testServiceImpl", TestServiceImpl.class);
        service.findAll();
}
}
