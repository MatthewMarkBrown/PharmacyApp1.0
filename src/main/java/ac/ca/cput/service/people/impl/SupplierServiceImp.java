package ac.ca.cput.service.people.impl;

import ac.ca.cput.Repository.people.SupplierRepository;
import ac.ca.cput.Repository.people.impl.SupplierRepositoryImp;
import ac.ca.cput.model.people.Supplier;
import ac.ca.cput.service.people.SupplierService;

import java.util.Set;

public class SupplierServiceImp implements SupplierService {
    private static SupplierServiceImp service = null;
    private SupplierRepository repo;

    private SupplierServiceImp() {
        this.repo = (SupplierRepository) SupplierRepositoryImp.getRepo();
    }

    public static SupplierServiceImp getService(){
        if(service == null) service = new SupplierServiceImp();
        return service;
    }


    @Override
    public Set<Supplier> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Supplier create(Supplier supplier) {
        return this.repo.create(supplier);
    }

    @Override
    public Supplier update(Supplier supplier) {
        return this.repo.update(supplier);
    }

    @Override
    public void delete(String id) {
    this.repo.delete(id);
    }

    @Override
    public Supplier read(String id) {
        return this.repo.read(id);
    }
}
