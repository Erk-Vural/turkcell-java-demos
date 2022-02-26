package com.enLayeredApp.Business.Abstracts;

import com.enLayeredApp.Entities.Concretes.Product;

public interface ProductService {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
}
