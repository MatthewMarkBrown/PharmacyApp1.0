package ac.ca.cput.Repository.people;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.people.Customer;

import java.util.Set;

public interface CustomerRepository extends IRepository<Customer, String> {
    Set<Customer> getAll();
}
