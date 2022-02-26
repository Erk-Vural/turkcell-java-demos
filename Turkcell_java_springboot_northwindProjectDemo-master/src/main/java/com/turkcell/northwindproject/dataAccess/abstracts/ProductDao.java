package com.turkcell.northwindproject.dataAccess.abstracts;

import com.turkcell.northwindproject.Entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
