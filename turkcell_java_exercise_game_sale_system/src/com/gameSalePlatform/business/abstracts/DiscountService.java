package com.gameSalePlatform.business.abstracts;

import com.gameSalePlatform.entities.concretes.Discount;

public interface DiscountService {
    void add(Discount discount);

    void update(Discount discount);

    void delete(Discount discount);
}
