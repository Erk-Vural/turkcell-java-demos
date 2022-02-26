package com.gameSalePlatform.business.concretes;

import com.gameSalePlatform.business.abstracts.CustomerService;
import com.gameSalePlatform.core.mernis.abstracts.MernisService;
import com.gameSalePlatform.dataAccess.abstracts.CustomerDao;
import com.gameSalePlatform.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

    private CustomerDao customerDao;
    // Mernis not working implementations are left undone.
    private MernisService mernisService;

    public CustomerManager() {
    }

    public CustomerManager(CustomerDao customerDao, MernisService mernisService) {
        this.customerDao = customerDao;
        this.mernisService = mernisService;
    }

    @Override
    public void add(Customer customer) {
        this.customerDao.add(customer);
    }

    @Override
    public void update(Customer customer) {
        this.customerDao.update(customer);
    }

    @Override
    public void delete(Customer customer) {
        this.customerDao.delete(customer);
    }
}
