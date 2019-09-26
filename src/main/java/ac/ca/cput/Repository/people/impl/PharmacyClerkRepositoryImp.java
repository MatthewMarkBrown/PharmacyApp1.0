package ac.ca.cput.Repository.people.impl;

import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.PharmacyClerkRepository;
import ac.ca.cput.model.admin.Pharmacy;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.model.people.PharmacyClerk;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Repository("PharmacyClerkInMemory")
public class PharmacyClerkRepositoryImp implements PharmacyClerkRepository {
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
        PharmacyClerk inDB = read(pharmacyClerk.getClerkId());

        if(inDB != null){
            pharmC.remove(inDB);
            pharmC.add(pharmacyClerk);
            return pharmacyClerk;
        }
        return null;
    }


    @Override
    public void delete(String id) {
        PharmacyClerk inDB = read(id);
        pharmC.remove(inDB);
    }

    @Override
    public PharmacyClerk read(String id) {
        return pharmC.stream().filter( pharmC -> pharmC.getClerkId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Set <PharmacyClerk> getAll(){
        return this.pharmC;
    }
}
