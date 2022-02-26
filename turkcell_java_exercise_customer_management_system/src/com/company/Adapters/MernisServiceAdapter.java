package com.company.Adapters;


import com.company.Abstract.ICustomerCheckService;
import com.company.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean isPersonExists(Customer customer) throws Exception {
        KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();

        return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getSocialSecurityNumber()),
                customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
                customer.getDateOfBirth().getYear());
    }
}
