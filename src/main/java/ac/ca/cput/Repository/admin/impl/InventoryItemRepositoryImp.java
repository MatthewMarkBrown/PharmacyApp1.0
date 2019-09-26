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

@Repository("InventoryItemInMemory")
public class InventoryItemRepositoryImp implements InventoryItemRepository {
    private static InventoryItemRepositoryImp repo = null;
    private Set<InventoryItem> inv;

    private InventoryItemRepositoryImp(){

        this.inv = new HashSet<>();
    }

    public static InventoryItemRepositoryImp getRepo(){
        if (repo == null){
            repo = new InventoryItemRepositoryImp();
        }
        return repo;
    }

    @Override
    public InventoryItem create(InventoryItem inventoryItem) {
        this.inv.add(inventoryItem);
        return inventoryItem;
    }

    @Override
    public InventoryItem update(InventoryItem inventoryItem) {
        InventoryItem inDB = read(inventoryItem.getItemCode());

        if(inDB != null){
            inv.remove(inDB);
            inv.add(inventoryItem);
            return inventoryItem;
        }
        return null;
    }


    @Override
    public void delete(String id) {
        InventoryItem inDB = read(id);
        inv.remove(inDB);
    }

    @Override
    public InventoryItem read(String id) {
        return inv.stream().filter( inv -> inv.getItemCode().equals(id)).findAny().orElse(null);
    }

    @Override
    public Set <InventoryItem> getAll(){
        return this.inv;
    }
}
