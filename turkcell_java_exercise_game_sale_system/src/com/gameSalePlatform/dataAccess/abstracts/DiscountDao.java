package com.gameSalePlatform.dataAccess.abstracts;

import com.gameSalePlatform.entities.concretes.Discount;

public interface DiscountDao {
    void add(Discount discount);

    void update(Discount discount);

    void delete(Discount discount);
}
