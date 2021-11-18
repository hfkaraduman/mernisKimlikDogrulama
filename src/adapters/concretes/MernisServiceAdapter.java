package adapters.concretes;

import MernisService.UHDKPSPublicSoap;
import adapters.abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        UHDKPSPublicSoap client = new UHDKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(
                    Long.valueOf(customer.getNationalityıd()),
                    customer.getFirtName(),
                    customer.getLastName(),
                    Integer.valueOf(customer.getDateOfBird())
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
