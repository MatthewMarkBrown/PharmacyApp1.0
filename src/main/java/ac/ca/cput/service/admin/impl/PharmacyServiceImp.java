package ac.ca.cput.service.admin.impl;

import ac.ca.cput.Repository.admin.PharmacyRepository;
import ac.ca.cput.Repository.admin.impl.PharmacyRepositoryImp;
import ac.ca.cput.model.admin.Pharmacy;
import ac.ca.cput.service.admin.PharmacyService;

import java.util.Set;

public class PharmacyServiceImp implements PharmacyService{
    private static PharmacyServiceImp service = null;
    private PharmacyRepository repo;

    private PharmacyServiceImp() {
        this.repo = (PharmacyRepository) PharmacyRepositoryImp.getRepo();
    }

    public static PharmacyServiceImp getService(){
        if(service == null) service = new PharmacyServiceImp();
        return service;
    }
    @Override
    public Set<Pharmacy> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Pharmacy create(Pharmacy pharmacy) {
        return this.create(pharmacy);
    }

    @Override
    public Pharmacy update(Pharmacy pharmacy) {
        return this.update(pharmacy);
    }

    @Override
    public void delete(String id) {
    this.repo.delete(id);
    }

    @Override
    public Pharmacy read(String id) {
        return this.repo.read(id);
    }
}
