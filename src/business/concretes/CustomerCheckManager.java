package business.concretes;

import adapters.abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}

