package ac.ca.cput.Repository.admin;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.admin.Inventory;

import java.util.Set;

public interface InventoryRepository extends IRepository<Inventory,String> {
Set<Inventory> getAll();
}
