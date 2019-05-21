package ac.ca.cput.model.people;

import java.util.Objects;

public class Customer {
    private String custId,firstName,lastName;

    public Customer(){}

    private Customer(Customer.Builder builder) {
        this.custId= builder.custId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getCustId() {
        return custId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder{
        private String custId,firstName,lastName;

        public Customer.Builder custId(String custId){
            this.custId = custId;
            return this;
        }

        public Customer.Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Customer.Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Customer customer){
            this.custId = customer.custId;
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            return this;
        }

        public Customer build() {
            return new Customer(this);

        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "clerkId='" + custId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(custId, customer.custId) &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId, firstName, lastName);
    }
}
