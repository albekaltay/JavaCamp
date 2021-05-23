package StarbucksAndNero.Adapter;

import MernisServiceReferane.WFEKPSPublicSoap;
import StarbucksAndNero.Business.Abstracts.CustomerCheckService;
import StarbucksAndNero.Entities.Concretes.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {

      WFEKPSPublicSoap client =  new WFEKPSPublicSoap();
      return client.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getYearOfBird());
     }
}
