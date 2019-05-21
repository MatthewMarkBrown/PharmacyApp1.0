package ac.ca.cput.model.admin;

import java.util.Objects;

public class InventoryItem {
    private String itemCode;

    private InventoryItem() {
    }

    private InventoryItem(InventoryItem.Builder builder) {
        this.itemCode = builder.itemCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public static class Builder {
        private String itemCode;

        public InventoryItem.Builder itemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }

        public InventoryItem.Builder copy(InventoryItem inventoryItem){
            this.itemCode = inventoryItem.itemCode;
            return this;
        }

        public InventoryItem build() {
            return new InventoryItem(this);

        }

    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "itemCode='" + itemCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventoryItem that = (InventoryItem) o;
        return Objects.equals(itemCode, that.itemCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemCode);
    }
}