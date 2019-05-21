package ac.ca.cput.service.admin;

import ac.ca.cput.model.admin.Inventory;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface InventoryService extends IService<Inventory,String> {
Set<Inventory> getAll();
}
