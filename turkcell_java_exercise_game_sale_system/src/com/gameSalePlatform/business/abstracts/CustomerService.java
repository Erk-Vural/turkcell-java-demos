package com.gameSalePlatform.business.abstracts;

import com.gameSalePlatform.entities.concretes.Customer;

public interface CustomerService {
    void add(Customer customer);

    void update(Customer customer);

    void delete(Customer customer);
}
