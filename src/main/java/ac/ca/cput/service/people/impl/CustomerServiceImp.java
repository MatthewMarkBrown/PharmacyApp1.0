package ac.ca.cput.service.people.impl;

import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.service.people.CustomerService;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository("CustomerServiceImp")
public class CustomerServiceImp implements CustomerService {

    private CustomerServiceImp service = null;
    private CustomerRepository repository;

    public CustomerServiceImp() {
        repository = CustomerRepositoryImp.getRepo();
        }

public CustomerServiceImp getService(){

        if(service == null){
        return new CustomerServiceImp();
        }
        return service;
        }

@Override
public Set<Customer> getAll() {
        return this.repository.getAll();
        }

@Override
public Customer create(Customer customer) {
        return repository.create(customer);
        }

@Override
public Customer read(String integer) {
        return repository.read(integer);
        }

@Override
public Customer update(Customer customer) {
        return repository.update(customer);
        }

@Override
public void delete(String integer) {

        repository.delete(integer);
        }
}