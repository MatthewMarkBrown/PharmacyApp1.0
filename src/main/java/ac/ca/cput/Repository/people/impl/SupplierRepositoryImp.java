package ac.ca.cput.Repository.people.impl;

import ac.ca.cput.Repository.people.SupplierRepository;
import ac.ca.cput.model.people.Supplier;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SupplierRepositoryImp implements SupplierRepository {
    private static SupplierRepositoryImp repo = null;
    private Set<Supplier> supp;

    private SupplierRepositoryImp(){
        this.supp = new HashSet<>();
    }

    public static SupplierRepositoryImp getRepo(){
        if (repo == null){
            repo = new SupplierRepositoryImp();
        }
        return repo;
    }

    @Override
    public Supplier create(Supplier supplier) {
       this.supp.add(supplier);
       return supplier;
    }

    @Override
    public Supplier update(Supplier supplier) {
        if(!supplier.equals(null)){
            return supplier;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<Supplier> ite = supp.iterator(); ite.hasNext(); ){
            Supplier sp = ite.next();
            if (sp.equals(new Supplier.Builder().supplierId(s))){
                this.supp.remove(s);
            }
        }
    }

    @Override
    public Supplier read(String id) {
        return null;
    }

    @Override
    public Set <Supplier> getAll(){
        return this.supp;
    }
}
