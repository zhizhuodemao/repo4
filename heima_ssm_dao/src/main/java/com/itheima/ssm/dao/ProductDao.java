package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Items;
import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {
   @Select("select * from product")
   List<Product> findAll();
   @Select("select * from items")
   List<Items> findMysql();
}
