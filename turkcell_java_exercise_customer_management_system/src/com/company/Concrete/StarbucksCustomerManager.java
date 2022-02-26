package com.company.Concrete;

import com.company.Abstract.BaseCustomerManager;
import com.company.Abstract.ICustomerCheckService;
import com.company.Abstract.ICustomerService;
import com.company.Adapters.MernisServiceAdapter;
import com.company.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager() {
    }

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }


    @Override
    public void save(Customer customer) throws Exception {
        if (customerCheckService.isPersonExists(customer)) {
            super.save(customer);
        } else {
            System.out.println("Social Security Number is not valid. ");
        }
    }
}
