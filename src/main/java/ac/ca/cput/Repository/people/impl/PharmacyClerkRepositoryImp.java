package ac.ca.cput.Repository.people.impl;

import ac.ca.cput.Repository.people.PharmacyClerkRepository;
import ac.ca.cput.model.people.PharmacyClerk;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PharmacyClerkRepositoryImp  implements PharmacyClerkRepository {
    private static PharmacyClerkRepositoryImp repo = null;
    private Set<PharmacyClerk> pharmC;

    private PharmacyClerkRepositoryImp(){
        this.pharmC = new HashSet<>();
    }

    public static PharmacyClerkRepositoryImp getRepo(){
        if (repo == null){
            repo = new PharmacyClerkRepositoryImp();
        }
        return repo;
    }

    @Override
    public PharmacyClerk create(PharmacyClerk pharmacyClerk) {
      this.pharmC.add(pharmacyClerk);
      return pharmacyClerk;
    }

    @Override
    public PharmacyClerk update(PharmacyClerk pharmacyClerk) {
        if(!pharmacyClerk.equals(null)){
            return pharmacyClerk;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<PharmacyClerk> ite = pharmC.iterator(); ite.hasNext(); ){
            PharmacyClerk pc = ite.next();
            if (pc.equals(new PharmacyClerk.Builder().clerkId(s))){
                this.pharmC.remove(pc);
            }
        }
    }

    @Override
    public PharmacyClerk read(String id) {
        return null;
    }

    @Override
    public Set <PharmacyClerk> getAll(){
        return this.pharmC;
    }
}
