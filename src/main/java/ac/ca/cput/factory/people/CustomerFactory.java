package ac.ca.cput.factory.people;

import ac.ca.cput.model.people.Customer;

public class CustomerFactory {
    public static Customer getCustomer(String custId, String firstName, String lastName) {
        return new Customer.Builder().custId(custId)
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
