package adapters.abstracts;

import entities.concretes.Customer;

public interface CustomerCheckService {
    boolean CheckIfRealPerson(Customer customer);
}
