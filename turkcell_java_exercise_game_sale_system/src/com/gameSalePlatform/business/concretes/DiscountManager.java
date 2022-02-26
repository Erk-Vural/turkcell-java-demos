package com.gameSalePlatform.business.concretes;

import com.gameSalePlatform.business.abstracts.DiscountService;
import com.gameSalePlatform.dataAccess.abstracts.DiscountDao;
import com.gameSalePlatform.entities.concretes.Discount;

public class DiscountManager implements DiscountService {
    private DiscountDao discountDao;

    public DiscountManager() {
    }

    public DiscountManager(DiscountDao discountDao) {
        this.discountDao = discountDao;
    }

    @Override
    public void add(Discount discount) {
        this.discountDao.add(discount);
    }

    @Override
    public void update(Discount discount) {
        this.discountDao.update(discount);
    }

    @Override
    public void delete(Discount discount) {
        this.discountDao.delete(discount);
    }
}
