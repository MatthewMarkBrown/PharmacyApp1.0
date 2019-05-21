package ac.ca.cput.service.people.impl;

import ac.ca.cput.Repository.people.PharmacyClerkRepository;
import ac.ca.cput.Repository.people.impl.PharmacyClerkRepositoryImp;
import ac.ca.cput.model.people.PharmacyClerk;
import ac.ca.cput.service.people.PharmacyClerkService;

import java.util.Set;

public class PharmacyClerkServiceImp implements PharmacyClerkService {
    private static PharmacyClerkServiceImp service = null;
    private PharmacyClerkRepository repo;

    private PharmacyClerkServiceImp() {
        this.repo = (PharmacyClerkRepository) PharmacyClerkRepositoryImp.getRepo();
    }

    public static PharmacyClerkServiceImp getService(){
        if(service == null) service = new PharmacyClerkServiceImp();
        return service;
    }


    @Override
    public Set<PharmacyClerk> getAll() {
        return this.repo.getAll();
    }

    @Override
    public PharmacyClerk create(PharmacyClerk pharmacyClerk) {
        return this.repo.create(pharmacyClerk);
    }

    @Override
    public PharmacyClerk update(PharmacyClerk pharmacyClerk) {
        return this.repo.update(pharmacyClerk);
    }

    @Override
    public void delete(String id) {
    this.repo.delete(id);
    }

    @Override
    public PharmacyClerk read(String id) {
        return this.repo.read(id);
    }
}
