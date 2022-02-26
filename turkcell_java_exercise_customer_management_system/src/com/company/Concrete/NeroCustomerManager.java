package com.company.Concrete;

import com.company.Abstract.BaseCustomerManager;
import com.company.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

    @Override
    public void save(Customer customer) throws Exception {
        super.save(customer);
    }
}
