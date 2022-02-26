package com.gameSalePlatform.core.mernis.abstracts;


import com.gameSalePlatform.entities.concretes.Customer;

public interface MernisService {

    public boolean checkIfRealPerson(Customer customer);
}