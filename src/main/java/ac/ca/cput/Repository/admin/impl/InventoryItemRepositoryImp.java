package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.InventoryItemRepository;
import ac.ca.cput.model.admin.InventoryItem;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InventoryItemRepositoryImp implements InventoryItemRepository {
    private static InventoryItemRepositoryImp repo = null;
    private Set<InventoryItem> invitem;

    private InventoryItemRepositoryImp(){
        this.invitem = new HashSet<>();
    }

    public static InventoryItemRepositoryImp getRepo(){
        if (repo == null){
            repo = new InventoryItemRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<InventoryItem> getAll() {
        return this.invitem;
    }

    @Override
    public InventoryItem create(InventoryItem inventoryItem) {
        this.invitem.add(inventoryItem);
        return inventoryItem;
    }

    @Override
    public InventoryItem update(InventoryItem inventoryItem) {
        if(!inventoryItem.equals(null)){
            return inventoryItem;
        }
        return null;
    }

    @Override
    public void delete(String t) {
        for(Iterator<InventoryItem> ite = invitem.iterator(); ite.hasNext(); ){
            InventoryItem ii = ite.next();
            if (ii.equals(new InventoryItem.Builder().itemCode(t))){
                this.invitem.remove(ii);
            }
        }
    }

    @Override
    public InventoryItem read(String id) {
        return null;
    }

   }


