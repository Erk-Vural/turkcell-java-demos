package com.gameSalePlatform.dataAccess.concretes.jdbcimpls;

import com.gameSalePlatform.dataAccess.abstracts.SaleDao;
import com.gameSalePlatform.entities.concretes.Sale;

public class SaleJdbsDao implements SaleDao {
    @Override
    public void add(Sale sale) {
        System.out.println("Sale jdbs added");
    }

    @Override
    public void update(Sale sale) {
        System.out.println("Sale jdbs updated");
    }

    @Override
    public void delete(Sale sale) {
        System.out.println("Sale jdbs deleted");
    }
}
