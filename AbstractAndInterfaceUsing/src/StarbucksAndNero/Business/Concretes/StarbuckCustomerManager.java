package StarbucksAndNero.Business.Concretes;

import StarbucksAndNero.Business.Abstracts.CustomerCheckService;
import StarbucksAndNero.Entities.Concretes.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager  {

    public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    private CustomerCheckService customerCheckService;



    @Override
    public void save(Customer customer) throws Exception {

        if (customerCheckService.checkIfRealPerson(customer)) {
                super.save(customer);
        }
        else{
            System.out.println("Not a valid person");

        }
    }


}
