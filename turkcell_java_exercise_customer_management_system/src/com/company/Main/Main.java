package com.company.Main;

import com.company.Abstract.BaseCustomerManager;
import com.company.Adapters.MernisServiceAdapter;
import com.company.Concrete.NeroCustomerManager;
import com.company.Concrete.StarbucksCustomerManager;
import com.company.Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

        Customer customer1 = new Customer(1, "Name1", "LastName1", LocalDate.parse("2000-01-01"), "12345678910");

        starbucksCustomerManager.save(customer1);
        System.out.println("----------------");
        neroCustomerManager.save(customer1);

    }
}
