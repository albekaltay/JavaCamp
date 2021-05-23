package StarbucksAndNero.Business.Abstracts;

import StarbucksAndNero.Entities.Concretes.Customer;

public interface CustomerCheckService {
     boolean checkIfRealPerson(Customer customer) throws Exception;


}
