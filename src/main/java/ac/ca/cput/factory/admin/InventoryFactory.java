package ac.ca.cput.factory.admin;

import ac.ca.cput.model.admin.Inventory;

public class InventoryFactory {
    public static Inventory getInventory(String location, String code) {
        return new Inventory.Builder().location(location)
                .code(code)
                .build();
    }


}
