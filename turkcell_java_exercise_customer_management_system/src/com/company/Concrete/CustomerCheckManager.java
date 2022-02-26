package com.company.Concrete;

import com.company.Abstract.ICustomerCheckService;
import com.company.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean isPersonExists(Customer customer) throws Exception {
        return true;
    }
}
