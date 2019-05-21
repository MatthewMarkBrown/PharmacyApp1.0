package ac.ca.cput.Repository.people.impl;

import ac.ca.cput.Repository.people.OwnerRepository;
import ac.ca.cput.model.people.Owner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
        if(!owner.equals(null)){
            return owner;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<Owner> ite = own.iterator(); ite.hasNext(); ){
            Owner o = ite.next();
            if (o.equals(new Owner.Builder().ownerId(s))){
                this.own.remove(o);
            }
        }
    }

    @Override
    public Owner read(String id) {
        return null;
    }

    @Override
    public Set <Owner> getAll(){
        return this.own;
    }
}
