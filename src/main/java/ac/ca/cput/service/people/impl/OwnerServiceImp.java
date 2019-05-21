package ac.ca.cput.service.people.impl;

import ac.ca.cput.Repository.people.OwnerRepository;
import ac.ca.cput.Repository.people.impl.OwnerRepositoryImp;
import ac.ca.cput.model.people.Owner;
import ac.ca.cput.service.people.OwnerService;

import java.util.Set;

public class OwnerServiceImp implements OwnerService {
    private static OwnerServiceImp service = null;
    private OwnerRepository repo;

    private OwnerServiceImp() {
        this.repo = (OwnerRepository) OwnerRepositoryImp.getRepo();
    }

    public static OwnerServiceImp getService(){
        if(service == null) service = new OwnerServiceImp();
        return service;
    }


    @Override
    public Set<Owner> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Owner create(Owner owner) {
        return this.repo.create(owner);
    }

    @Override
    public Owner update(Owner owner) {
        return this.repo.update(owner);
    }

    @Override
    public void delete(String id) {
    this.repo.delete(id);
    }

    @Override
    public Owner read(String id) {
        return this.repo.read(id);
    }
}
