package ac.ca.cput.service.admin.impl;

import ac.ca.cput.Repository.admin.PharmacyRepository;
import ac.ca.cput.Repository.admin.impl.PharmacyRepositoryImp;
import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.PharmacyClerkRepository;
import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
import ac.ca.cput.Repository.people.impl.PharmacyClerkRepositoryImp;
import ac.ca.cput.model.admin.Pharmacy;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.model.people.PharmacyClerk;
import ac.ca.cput.service.admin.PharmacyService;
import ac.ca.cput.service.people.CustomerService;
import ac.ca.cput.service.people.PharmacyClerkService;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository("PharmacyServiceImp")
public class PharmacyServiceImp implements PharmacyService {

    private PharmacyServiceImp service = null;
    private PharmacyRepository repository;

    public PharmacyServiceImp() {
        repository = PharmacyRepositoryImp.getRepo();
    }

    public PharmacyServiceImp getService(){

        if(service == null){
            return new PharmacyServiceImp();
        }
        return service;
    }

    @Override
    public Set<Pharmacy> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Pharmacy create(Pharmacy pharmacy) {
        return repository.create(pharmacy);
    }

    @Override
    public Pharmacy read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Pharmacy update(Pharmacy pharmacy) {
        return repository.update(pharmacy);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }
}