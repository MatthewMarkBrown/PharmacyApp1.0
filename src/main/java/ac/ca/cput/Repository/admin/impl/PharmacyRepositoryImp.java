package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.PharmacyRepository;
import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.PharmacyClerkRepository;
import ac.ca.cput.model.admin.Pharmacy;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.model.people.PharmacyClerk;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Repository("PharmacyInMemory")
public class PharmacyRepositoryImp implements PharmacyRepository {
    private static PharmacyRepositoryImp repo = null;
    private Set<Pharmacy> pharmC;

    private PharmacyRepositoryImp(){

        this.pharmC = new HashSet<>();
    }

    public static PharmacyRepositoryImp getRepo(){
        if (repo == null){
            repo = new PharmacyRepositoryImp();
        }
        return repo;
    }

    @Override
    public Pharmacy create(Pharmacy pharmacy) {
        this.pharmC.add(pharmacy);
        return pharmacy;
    }

    @Override
    public Pharmacy update(Pharmacy pharmacy) {
        Pharmacy inDB = read(pharmacy.getPharmacyId());

        if(inDB != null){
            pharmC.remove(inDB);
            pharmC.add(pharmacy);
            return pharmacy;
        }
        return null;
    }


    @Override
    public void delete(String id) {
        Pharmacy inDB = read(id);
        pharmC.remove(inDB);
    }

    @Override
    public Pharmacy read(String id) {
        return pharmC.stream().filter( pharmC -> pharmC.equals(id)).findAny().orElse(null);
    }

    @Override
    public Set <Pharmacy> getAll(){
        return this.pharmC;
    }
}
