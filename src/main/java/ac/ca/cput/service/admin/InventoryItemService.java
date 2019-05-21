package ac.ca.cput.service.admin;

import ac.ca.cput.model.admin.InventoryItem;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface InventoryItemService extends IService<InventoryItemService,String> {
Set<InventoryItem> getAll();
}
