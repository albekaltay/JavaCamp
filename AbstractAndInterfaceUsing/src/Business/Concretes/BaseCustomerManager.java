package Business.Concretes;

import Business.Abstracts.CustomerService;
import Entities.Concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public void save(Customer customer) throws Exception {
    System.out.println("Saved to do db: " + customer.getFirstName());
    }
}
