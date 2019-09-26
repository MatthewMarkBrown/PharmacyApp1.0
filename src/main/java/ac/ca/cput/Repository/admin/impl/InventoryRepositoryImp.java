package ac.ca.cput.Repository.admin.impl;



import ac.ca.cput.Repository.admin.ConsumptionRepository;
import ac.ca.cput.Repository.admin.InventoryItemRepository;
import ac.ca.cput.Repository.admin.InventoryRepository;
import ac.ca.cput.Repository.admin.ShipmentRepository;
import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.model.admin.Consumption;
import ac.ca.cput.model.admin.Inventory;
import ac.ca.cput.model.admin.InventoryItem;
import ac.ca.cput.model.admin.Shipment;
import ac.ca.cput.model.people.Customer;
import org.springframework.stereotype.Repository;
import sun.awt.SunHints;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Repository("InventoryInMemory")
public class InventoryRepositoryImp implements InventoryRepository {
    private static InventoryRepositoryImp repo = null;
    private Set<Inventory> inv;

    private InventoryRepositoryImp(){

        this.inv = new HashSet<>();
    }

    public static InventoryRepositoryImp getRepo(){
        if (repo == null){
            repo = new InventoryRepositoryImp();
        }
        return repo;
    }

    @Override
    public Inventory create(Inventory inventory) {
        this.inv.add(inventory);
        return inventory;
    }

    @Override
    public Inventory update(Inventory inventory) {
        Inventory inDB = read(inventory.getCode());

        if(inDB != null){
            inv.remove(inDB);
            inv.add(inventory);
            return inventory;
        }
        return null;
    }


    @Override
    public void delete(String id) {
        Inventory inDB = read(id);
        inv.remove(inDB);
    }

    @Override
    public Inventory read(String id) {
        return inv.stream().filter( inv -> inv.getCode().equals(id)).findAny().orElse(null);
    }

    @Override
    public Set <Inventory> getAll(){
        return this.inv;
    }
}
