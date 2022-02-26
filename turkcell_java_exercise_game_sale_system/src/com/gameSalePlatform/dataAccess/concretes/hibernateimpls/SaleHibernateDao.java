package com.gameSalePlatform.dataAccess.concretes.hibernateimpls;

import com.gameSalePlatform.dataAccess.abstracts.SaleDao;
import com.gameSalePlatform.entities.concretes.Sale;

public class SaleHibernateDao implements SaleDao {
    @Override
    public void add(Sale sale) {
        System.out.println("Sale hibernate added");
    }

    @Override
    public void update(Sale sale) {
        System.out.println("Sale hibernate updated");
    }

    @Override
    public void delete(Sale sale) {
        System.out.println("Sale hibernate deleted");
    }
}
