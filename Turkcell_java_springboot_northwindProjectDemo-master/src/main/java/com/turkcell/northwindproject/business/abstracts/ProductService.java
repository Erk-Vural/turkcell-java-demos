package com.turkcell.northwindproject.business.abstracts;

import com.turkcell.northwindproject.Entities.concretes.Product;

import java.util.List;

public interface ProductService{
    List<Product> getAll();
    void add(Product product);
}
