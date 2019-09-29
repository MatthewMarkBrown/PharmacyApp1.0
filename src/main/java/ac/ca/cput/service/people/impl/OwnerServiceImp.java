package ac.ca.cput.service.people.impl;

import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.OwnerRepository;
import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
import ac.ca.cput.Repository.people.impl.OwnerRepositoryImp;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.model.people.Owner;
import ac.ca.cput.service.people.CustomerService;
import ac.ca.cput.service.people.OwnerService;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository("OwnerServiceImp")
public class OwnerServiceImp implements OwnerService {

    private OwnerServiceImp service = null;
    private OwnerRepository repository;

    public OwnerServiceImp() {
        repository = OwnerRepositoryImp.getRepo();
    }

    public OwnerServiceImp getService(){

        if(service == null){
            return new OwnerServiceImp();
        }
        return service;
    }

    @Override
    public Set<Owner> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Owner create(Owner owner) {
        return repository.create(owner);
    }

    @Override
    public Owner read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Owner update(Owner owner) {
        return repository.update(owner);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }
}