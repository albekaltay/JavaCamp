package Business.Abstracts;

import Entities.Concretes.Customer;

public interface CustomerService {
    void save(Customer customer) throws Exception;

}
