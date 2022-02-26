package com.gameSalePlatform.core.mernis.concrete;

import com.gameSalePlatform.core.mernis.abstracts.MernisService;
import com.gameSalePlatform.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.rmi.RemoteException;

public class MernisManager implements MernisService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        KPSPublicSoap proxy = new KPSPublicSoapProxy();
        try {
            return proxy.TCKimlikNoDogrula(Long.valueOf(customer.getIdentityNumber()).longValue(),
                    customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
                    customer.getYearOfBirth().getYear());
        } catch (NumberFormatException | RemoteException e) {

            return false;
        }

    }

}