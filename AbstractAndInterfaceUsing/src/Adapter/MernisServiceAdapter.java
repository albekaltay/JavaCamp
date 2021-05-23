package Adapter;

import MernisServiceReferane.WFEKPSPublicSoap;
import Business.Abstracts.CustomerCheckService;
import Entities.Concretes.Customer;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {

      WFEKPSPublicSoap client =  new WFEKPSPublicSoap();
      return client.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getYearOfBird());
     }
}
