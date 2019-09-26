package ac.ca.cput.Repository.people.impl;

import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.OwnerRepository;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.model.people.Owner;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Repository("OwnerInMemory")
public class OwnerRepositoryImp implements OwnerRepository {
    private static OwnerRepositoryImp repo = null;
    private Set<Owner> own;

    private OwnerRepositoryImp(){

        this.own = new HashSet<>();
    }

    public static OwnerRepositoryImp getRepo(){
        if (repo == null){
            repo = new OwnerRepositoryImp();
        }
        return repo;
    }

    @Override
    public Owner create(Owner owner) {
        this.own.add(owner);
        return owner;
    }

    @Override
    public Owner update(Owner owner) {
        Owner inDB = read (owner.getOwnerId());
        if(inDB != null){
            own.remove(inDB);
            own.add(owner);
            return owner;
        }
        return null;
    }


    @Override
    public void delete(String id) {
        Owner inDB = read(id);
        own.remove(inDB);
    }

    @Override
    public Owner read(String id) {
        return own.stream().filter( own -> own.getOwnerId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Set <Owner> getAll(){
        return this.own;
    }
}
