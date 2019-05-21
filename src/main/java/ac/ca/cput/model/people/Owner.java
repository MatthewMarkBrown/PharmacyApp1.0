package ac.ca.cput.model.people;

import java.util.Objects;

public class Owner {
    private String ownerId, firstName,lastName;

    public Owner(){}

    private Owner(Owner.Builder builder) {
        this.ownerId= builder.ownerId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder{
        private String ownerId,firstName,lastName;

        public Owner.Builder ownerId(String custId){
            this.ownerId = ownerId;
            return this;
        }

        public Owner.Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Owner.Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Owner.Builder copy(Owner owner){
            this.ownerId = owner.ownerId;
            this.firstName = owner.firstName;
            this.lastName = owner.lastName;
            return this;
        }

        public Owner build() {
            return new Owner(this);

        }

        @Override
        public String toString() {
            return "Builder{" +
                    "ownerId='" + ownerId + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(ownerId, builder.ownerId) &&
                    Objects.equals(firstName, builder.firstName) &&
                    Objects.equals(lastName, builder.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(ownerId, firstName, lastName);
        }
    }

}
