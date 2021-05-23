package Business.Concretes;

import MernisServiceReferane.WFEKPSPublicSoap;
import Business.Abstracts.CustomerCheckService;
import Entities.Concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {

    return true;


    }
}
