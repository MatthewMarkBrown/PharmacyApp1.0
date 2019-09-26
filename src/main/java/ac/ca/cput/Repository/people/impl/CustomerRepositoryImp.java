package ac.ca.cput.Repository.people.impl;

import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.model.people.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Repository("CustomerInMemory")
public class CustomerRepositoryImp implements CustomerRepository {
    private static CustomerRepositoryImp repo = null;
    private Set<Customer> cust;

    private CustomerRepositoryImp(){

        this.cust = new HashSet<>();
    }

    public static CustomerRepositoryImp getRepo(){
        if (repo == null){
            repo = new CustomerRepositoryImp();
        }
        return repo;
    }

    @Override
    public Customer create(Customer customer) {
        this.cust.add(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        Customer inDB = read(customer.getCustId());

        if(inDB != null){
            cust.remove(inDB);
            cust.add(customer);
            return customer;
        }
        return null;
    }


    @Override
    public void delete(String id) {
        Customer inDB = read(id);
        cust.remove(inDB);
    }

    @Override
    public Customer read(String id) {
        return cust.stream().filter( cust -> cust.getCustId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Set <Customer> getAll(){
        return this.cust;
    }
}
