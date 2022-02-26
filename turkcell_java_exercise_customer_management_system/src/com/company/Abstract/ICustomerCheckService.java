package com.company.Abstract;

import com.company.Entities.Customer;

public interface ICustomerCheckService {
    boolean isPersonExists(Customer customer) throws Exception;
}
