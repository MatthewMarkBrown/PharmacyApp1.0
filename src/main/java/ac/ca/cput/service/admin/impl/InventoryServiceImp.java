//package ac.ca.cput.service.admin.impl;
//
//import ac.ca.cput.Repository.admin.InventoryRepository;
//import ac.ca.cput.Repository.admin.impl.InventoryRepositoryImp;
//import ac.ca.cput.model.admin.Inventory;
//import ac.ca.cput.service.admin.InventoryService;
//
//import java.util.Set;
//
//public class InventoryServiceImp implements InventoryService {
//    private static InventoryServiceImp service = null;
//    private InventoryRepository repository;
//
//    private InventoryServiceImp() {
//        this.repository =InventoryRepositoryImp.getRepo();
//    }
//
//    public static InventoryServiceImp getService(){
//        if (service == null) service = new InventoryServiceImp();
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
//        return this.repository.create(inventory);
//    }
//
//    @Override
//    public Inventory update(Inventory inventory) {
//        return this.repository.update(inventory);
//    }
//
//    @Override
//    public void delete(String id) {
//    this.repository.delete(id);
//    }
//
//    @Override
//    public Inventory read(String id) {
//        return this.repository.read(id);
//    }
//}
