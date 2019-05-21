package ac.ca.cput.service.people;

import ac.ca.cput.model.people.Customer;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface CustomerService extends IService<Customer, String> {
Set<Customer> getAll();
}
