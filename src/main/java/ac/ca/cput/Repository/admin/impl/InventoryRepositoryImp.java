package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.InventoryRepository;
import ac.ca.cput.model.admin.Inventory;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
    public Set<Inventory> getAll() {
        return this.inv;
    }

    @Override
    public Inventory create(Inventory inventory) {
        this.inv.add(inventory);
        return inventory;
    }

    @Override
    public Inventory update(Inventory inventory) {
        if(!inventory.equals(null)){
            return inventory;
        }
        return null;
    }

    @Override
    public void delete(String t) {
        for(Iterator<Inventory> ite = inv.iterator(); ite.hasNext(); ){
            Inventory in = ite.next();
            if (in.equals(new Inventory.Builder().code(t))){
                this.inv.remove(in);
            }
        }
    }

    @Override
    public Inventory read(String id) {
        return null;
    }
}
