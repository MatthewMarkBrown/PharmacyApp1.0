package ac.ca.cput.model.people;

import java.util.Objects;

public class PharmacyClerk {
private String clerkId,firstName,lastName;

private PharmacyClerk(){}

    private PharmacyClerk(Builder builder) {
        this.clerkId = builder.clerkId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getClerkId() {
        return clerkId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder{
    private String clerkId,firstName,lastName;

    public Builder clerkId(String clerkId){
    this.clerkId = clerkId;
    return this;
    }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }


        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public PharmacyClerk.Builder copy(PharmacyClerk pharmacyClerk){
            this.clerkId = pharmacyClerk.clerkId;
            this.firstName = pharmacyClerk.firstName;
            this.lastName = pharmacyClerk.lastName;
            return this;
        }

        public PharmacyClerk build() {
        return new PharmacyClerk(this);
     }
    }

    @Override
    public String toString() {
        return "PharmacyClerk{" +
                "clerkId='" + clerkId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PharmacyClerk that = (PharmacyClerk) o;
        return Objects.equals(clerkId, that.clerkId) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clerkId, firstName, lastName);
    }
}
