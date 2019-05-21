package ac.ca.cput.model.admin;

import java.util.Objects;

public class Inventory {
private String location,code;

    private Inventory() {
    }

    private Inventory(Inventory.Builder builder) {
        this.location = builder.location;
        this.code = builder.code;
    }

    public String getLocation() {
        return location;
    }

    public String getCode() {
        return code;
    }

    public static class Builder {
        private String location, code;

        public Inventory.Builder location(String location) {
            this.location = location;
            return this;
        }

        public Inventory.Builder code(String code) {
            this.code = code;
            return this;
        }

        public Inventory.Builder copy(Inventory inventory){
            this.location = inventory.location;
            this.code = inventory.code;
            return this;
        }

        public Inventory build() {
            return new Inventory(this);

        }

    }

    @Override
    public String toString() {
        return "Inventory{" +
                "Location='" + location + '\'' +
                ", Code='" + code + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return Objects.equals(location, inventory.location) &&
                Objects.equals(code, inventory.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, code);
    }
}
