package com.turkcell.northwindproject.api.controllers;

import com.turkcell.northwindproject.Entities.concretes.Product;
import com.turkcell.northwindproject.business.abstracts.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {
    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<Product> getAll(){
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Product product) {
        this.productService.add(product);
    }
}
