package com.gameSalePlatform.dataAccess.concretes.hibernateimpls;

import com.gameSalePlatform.dataAccess.abstracts.DiscountDao;
import com.gameSalePlatform.entities.concretes.Discount;

public class DiscountHibernateDao implements DiscountDao {
    @Override
    public void add(Discount discount) {
        System.out.println("Discount hibernate added");
    }

    @Override
    public void update(Discount discount) {
        System.out.println("Discount hibernate updated");

    }

    @Override
    public void delete(Discount discount) {
        System.out.println("Discount hibernate deleted");
    }
}
