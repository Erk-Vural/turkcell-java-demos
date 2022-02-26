package com.gameSalePlatform.dataAccess.abstracts;

import com.gameSalePlatform.entities.concretes.Sale;

public interface SaleDao {
    void add(Sale sale);

    void update(Sale sale);

    void delete(Sale sale);
}
