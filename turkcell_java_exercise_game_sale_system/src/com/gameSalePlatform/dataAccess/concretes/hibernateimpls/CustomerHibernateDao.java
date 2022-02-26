package com.gameSalePlatform.dataAccess.concretes.hibernateimpls;

import com.gameSalePlatform.dataAccess.abstracts.CustomerDao;
import com.gameSalePlatform.entities.concretes.Customer;

public class CustomerHibernateDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Customer hibernate added");
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Customer hibernate updated");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Customer hibernate deleted");
    }
}
