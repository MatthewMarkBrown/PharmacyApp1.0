package ac.ca.cput.service.people.impl;

import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.SupplierRepository;
import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
import ac.ca.cput.Repository.people.impl.SupplierRepositoryImp;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.model.people.Supplier;
import ac.ca.cput.service.people.CustomerService;
import ac.ca.cput.service.people.SupplierService;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository("SupplierServiceImp")
public class SupplierServiceImp implements SupplierService {

    private SupplierServiceImp service = null;
    private SupplierRepository repository;

    public SupplierServiceImp() {
        repository = SupplierRepositoryImp.getRepo();
    }

    public SupplierServiceImp getService(){

        if(service == null){
            return new SupplierServiceImp();
        }
        return service;
    }

    @Override
    public Set<Supplier> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Supplier create(Supplier supplier) {
        return repository.create(supplier);
    }

    @Override
    public Supplier read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Supplier update(Supplier supplier) {
        return repository.update(supplier);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }
}