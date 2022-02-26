package com.gameSalePlatform.dataAccess.concretes.jdbcimpls;

import com.gameSalePlatform.dataAccess.abstracts.DiscountDao;
import com.gameSalePlatform.entities.concretes.Discount;

public class DiscountJdbsDao implements DiscountDao {
    @Override
    public void add(Discount discount) {
        System.out.println("Discount jdbs added");
    }

    @Override
    public void update(Discount discount) {
        System.out.println("Discount jdbs updated");
    }

    @Override
    public void delete(Discount discount) {
        System.out.println("Discount jdbs deleted");
    }
}
