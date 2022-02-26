package com.gameSalePlatform.business.concretes;

import com.gameSalePlatform.business.abstracts.SaleService;
import com.gameSalePlatform.core.mernis.abstracts.MernisService;
import com.gameSalePlatform.dataAccess.abstracts.SaleDao;
import com.gameSalePlatform.entities.concretes.Customer;
import com.gameSalePlatform.entities.concretes.Game;
import com.gameSalePlatform.entities.concretes.Sale;

public class SaleManager implements SaleService {
    private SaleDao saleDao;
    private Customer customer;
    private Game game;
    // Mernis not working implementations are left undone.
    private MernisService mernisService;

    public SaleManager() {
    }

    public SaleManager(SaleDao saleDao, Customer customer, Game game, MernisService mernisService) {
        this.saleDao = saleDao;
        this.customer = customer;
        this.game = game;
        this.mernisService = mernisService;
    }

    @Override
    public void add(Sale sale) {
        this.saleDao.add(sale);
    }

    @Override
    public void update(Sale sale) {
        this.saleDao.update(sale);
    }

    @Override
    public void delete(Sale sale) {
        this.saleDao.delete(sale);
    }
}
