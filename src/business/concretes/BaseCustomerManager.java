package business.concretes;

import business.abstracts.CustomerService;
import entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

    public void Save(Customer customer) throws Exception {
        System.out.println("Saved to db :" + customer.getFirtName());
    }
}
