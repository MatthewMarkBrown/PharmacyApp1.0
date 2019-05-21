package ac.ca.cput.service.people.impl;

import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.service.people.CustomerService;

import java.util.Set;

public class CustomerServiceImp implements CustomerService {
    private static CustomerServiceImp service = null;
    private CustomerRepository repo;

    private CustomerServiceImp() {
        this.repo = (CustomerRepository) CustomerRepositoryImp.getRepo();
    }

    public static CustomerServiceImp getService(){
        if(service == null) service = new CustomerServiceImp();
        return service;
    }
    @Override
    public Set<Customer> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Customer create(Customer customer) {
        return this.create(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return this.repo.update(customer);
    }

    @Override
    public void delete(String id) {
    this.repo.delete(id);
    }

    @Override
    public Customer read(String id) {
        return this.repo.read(id);
    }
}
