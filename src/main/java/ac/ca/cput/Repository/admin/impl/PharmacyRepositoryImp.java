package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.PharmacyRepository;
import ac.ca.cput.model.admin.Pharmacy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PharmacyRepositoryImp implements PharmacyRepository {
    private static PharmacyRepositoryImp repo = null;
    private Set<Pharmacy> pharm;

    private PharmacyRepositoryImp(){
        this.pharm = new HashSet<>();
    }

    public static PharmacyRepositoryImp getRepo(){
        if (repo == null){
            repo = new PharmacyRepositoryImp();
        }
        return repo;
    }

@Override
    public Pharmacy create(Pharmacy pharmacy) {
       this.pharm.add(pharmacy);
       return pharmacy;
    }


    @Override

    public Pharmacy update(Pharmacy pharmacy) {
        if(!pharmacy.equals(null)){
            return pharmacy;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<Pharmacy> ite = pharm.iterator(); ite.hasNext(); ){
            Pharmacy p = ite.next();
            if (p.equals(new Pharmacy.Builder().pharmacyId(s))){
                this.pharm.remove(p);
            }
        }
    }

    @Override
    public Pharmacy read(String id) {
        return null;
    }

    @Override
    public Set <Pharmacy> getAll(){
        return this.pharm;
    }
}
