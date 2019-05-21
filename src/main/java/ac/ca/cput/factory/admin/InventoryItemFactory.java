package ac.ca.cput.factory.admin;

import ac.ca.cput.model.admin.InventoryItem;

public class InventoryItemFactory {
    public static InventoryItem getInventoryItem(String itemCode) {
        return new InventoryItem.Builder().itemCode(itemCode)
                .build();
    }

}
