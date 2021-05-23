package StarbucksAndNero;

import StarbucksAndNero.Adapter.MernisServiceAdapter;
import StarbucksAndNero.Business.Concretes.BaseCustomerManager;
import StarbucksAndNero.Business.Concretes.NeroCustomerManager;
import StarbucksAndNero.Business.Concretes.StarbuckCustomerManager;
import StarbucksAndNero.Entities.Concretes.Customer;

public class Main {

    public static void main(String[] args) throws Exception {

       BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
       customerManager.save(new Customer(1,"Albek","Altay",1,1,1997,12345678912L));

       BaseCustomerManager customerManager1 = new NeroCustomerManager();
       customerManager1.save(new Customer(2,"Albek","Altay",1,1,1997,12345678912L));



    }
}

