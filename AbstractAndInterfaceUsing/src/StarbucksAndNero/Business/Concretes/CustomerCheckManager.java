package StarbucksAndNero.Business.Concretes;

import StarbucksAndNero.Business.Abstracts.CustomerCheckService;
import StarbucksAndNero.Entities.Concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {

    return true;


    }
}
