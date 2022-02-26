package com.gameSalePlatform.dataAccess.concretes.jdbcimpls;

import com.gameSalePlatform.dataAccess.abstracts.CustomerDao;
import com.gameSalePlatform.entities.concretes.Customer;

public class CustomerJdbsDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Customer jdbs added");
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Customer jdbs updated");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Customer jdbs deleted");
    }
}
