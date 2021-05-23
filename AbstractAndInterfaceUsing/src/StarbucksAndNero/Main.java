package StarbucksAndNero;

import Adapter.MernisServiceAdapter;
import Business.Concretes.BaseCustomerManager;
import Business.Concretes.CustomerCheckManager;
import Business.Concretes.NeroCustomerManager;
import Business.Concretes.StarbuckCustomerManager;
import Entities.Concretes.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

       BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
       customerManager.save(new Customer(1,"Albek","Altay",1,1,1997,12345678912L));

       BaseCustomerManager customerManager1 = new NeroCustomerManager();
       customerManager1.save(new Customer(2,"Albek","Altay",1,1,1997,12345678912L));



    }
}

