package com.enLayeredApp.Business.Concretes;

import com.enLayeredApp.Business.Abstracts.ProductService;
import com.enLayeredApp.DataAccess.Abstracts.ProductDao;
import com.enLayeredApp.Entities.Concretes.Product;

public class ProductManager implements ProductService {

    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void add(Product product) {

        if(product.getUnitPrice() > 0) {
            this.productDao.add(product);
        }
    }

    @Override
    public void update(Product product) {
        System.out.println("Product updated " + product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Product deleted " + product.getName());
    }

}
