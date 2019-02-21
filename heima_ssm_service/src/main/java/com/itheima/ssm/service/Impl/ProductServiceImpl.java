package com.itheima.ssm.service.Impl;

import com.itheima.ssm.dao.ProductDao;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.ProductService;
import java.util.List;
//@Service("itemsService")
public class ProductServiceImpl implements ProductService {
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    //    @Autowired
    private ProductDao productDao;
    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }
}
