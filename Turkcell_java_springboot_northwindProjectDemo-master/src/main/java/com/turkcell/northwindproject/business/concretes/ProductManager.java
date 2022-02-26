package com.turkcell.northwindproject.business.concretes;

import com.turkcell.northwindproject.Entities.concretes.Product;
import com.turkcell.northwindproject.business.abstracts.ProductService;
import com.turkcell.northwindproject.dataAccess.abstracts.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {
    ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        // Business code
        return this.productDao.findAll();

    }

    @Override
    public void add(Product product) {
        this.productDao.save(product);
    }
}
