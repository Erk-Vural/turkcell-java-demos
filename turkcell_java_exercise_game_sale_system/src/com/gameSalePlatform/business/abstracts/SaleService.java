package com.gameSalePlatform.business.abstracts;

import com.gameSalePlatform.entities.concretes.Sale;

public interface SaleService {
    void add(Sale sale);

    void update(Sale sale);

    void delete(Sale sale);
}
