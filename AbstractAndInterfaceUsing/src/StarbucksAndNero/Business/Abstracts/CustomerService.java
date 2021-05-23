package StarbucksAndNero.Business.Abstracts;

import StarbucksAndNero.Entities.Concretes.Customer;

public interface CustomerService {
    void save(Customer customer) throws Exception;

}
