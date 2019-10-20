//package ac.ca.cput.Repository.people.impl;
//
//import ac.ca.cput.Repository.people.CustomerRepository;
//import ac.ca.cput.Repository.people.SupplierRepository;
//import ac.ca.cput.model.people.Customer;
//import ac.ca.cput.model.people.Supplier;
//import org.springframework.stereotype.Repository;
//
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//
//@Repository("SupplierInMemory")
//public class SupplierRepositoryImp implements SupplierRepository {
//    private static SupplierRepositoryImp repo = null;
//    private Set<Supplier> supp;
//
//    private SupplierRepositoryImp(){
//
//        this.supp = new HashSet<>();
//    }
//
//    public static SupplierRepositoryImp getRepo(){
//        if (repo == null){
//            repo = new SupplierRepositoryImp();
//        }
//        return repo;
//    }
//
//    @Override
//    public Supplier create(Supplier supplier) {
//        this.supp.add(supplier);
//        return supplier;
//    }
//
//    @Override
//    public Supplier update(Supplier supplier) {
//        Supplier inDB = read(supplier.getSupplierId());
//
//        if(inDB != null){
//            supp.remove(inDB);
//            supp.add(supplier);
//            return supplier;
//        }
//        return null;
//    }
//
//
//    @Override
//    public void delete(String id) {
//        Supplier inDB = read(id);
//        supp.remove(inDB);
//    }
//
//    @Override
//    public Supplier read(String id) {
//        return supp.stream().filter( supp -> supp.getSupplierId().equals(id)).findAny().orElse(null);
//    }
//
//    @Override
//    public Set <Supplier> getAll(){
//        return this.supp;
//    }
//}
