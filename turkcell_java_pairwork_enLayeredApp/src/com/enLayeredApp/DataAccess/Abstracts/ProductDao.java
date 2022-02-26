package com.enLayeredApp.DataAccess.Abstracts;

import com.enLayeredApp.Entities.Concretes.Product;

public interface ProductDao {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    void test();
}
