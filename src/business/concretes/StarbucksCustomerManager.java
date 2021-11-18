package business.concretes;

import adapters.abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {

    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) throws Exception {
        if(customerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);
        }
        else {
            System.out.println("Not a valid person");
            throw new Exception("Not a valid person");
        }
    }


}