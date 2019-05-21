package ac.ca.cput.Repository.people.impl;

import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.model.people.Customer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
        if(!customer.equals(null)){
            return customer;
        }
        return null;
    }


    @Override
    public void delete(String s) {
        for(Iterator<Customer> ite = cust.iterator(); ite.hasNext(); ){
            Customer c = ite.next();
            if (c.equals(new Customer.Builder().custId(s))){
                this.cust.remove(c);
            }
        }
    }

    @Override
    public Customer read(String id) {
        return null;
    }

    @Override
    public Set <Customer> getAll(){
        return this.cust;
    }
}
