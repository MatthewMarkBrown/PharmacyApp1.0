package ac.ca.cput.Repository.admin;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.admin.InventoryItem;

import java.util.Set;

public interface InventoryItemRepository extends IRepository<InventoryItem, String> {
    Set<InventoryItem> getAll();
}
