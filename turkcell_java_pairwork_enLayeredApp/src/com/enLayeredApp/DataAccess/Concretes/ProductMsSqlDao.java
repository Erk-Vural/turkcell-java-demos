package com.enLayeredApp.DataAccess.Concretes;

import com.enLayeredApp.DataAccess.Abstracts.ProductDao;
import com.enLayeredApp.Entities.Concretes.Product;

public class ProductMsSqlDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("added to MsSql");
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void test() {

    }
}
