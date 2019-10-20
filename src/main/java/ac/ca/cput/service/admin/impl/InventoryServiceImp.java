//package ac.ca.cput.service.admin.impl;
//
//import ac.ca.cput.Repository.admin.InventoryRepository;
//
//import ac.ca.cput.Repository.people.CustomerRepository;
//
//import ac.ca.cput.model.admin.Inventory;
//import ac.ca.cput.model.people.Customer;
//import ac.ca.cput.service.admin.InventoryService;
//import ac.ca.cput.service.people.CustomerService;
//import org.springframework.stereotype.Repository;
//
//import java.util.Set;
//
//@Repository("InventoryServiceImp")
//public class InventoryServiceImp implements InventoryService {
//
//    private InventoryServiceImp service = null;
//    private InventoryRepository repository;
//
//    public InventoryServiceImp() {
//        repository = InventoryRepositoryImp.getRepo();
//    }
//
//    public InventoryServiceImp getService(){
//
//        if(service == null){
//            return new InventoryServiceImp();
//        }
//        return service;
//    }
//
//    @Override
//    public Set<Inventory> getAll() {
//        return this.repository.getAll();
//    }
//
//    @Override
//    public Inventory create(Inventory inventory) {
//        return repository.create(inventory);
//    }
//
//    @Override
//    public Inventory read(Inventory integer) {
//        return repository.read(integer);
//    }
//
//    @Override
//    public Inventory update(Inventory inventory) {
//        return repository.update(inventory);
//    }
//
//    @Override
//    public void delete(String integer) {
//
//        repository.delete(integer);
//    }
//}