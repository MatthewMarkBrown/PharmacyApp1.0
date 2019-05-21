package ac.ca.cput.factory.people;

import ac.ca.cput.model.people.Owner;

public class OwnerFactory {
    public static Owner getOwner(String ownerId,String firstName, String lastName) {
        return new Owner.Builder().ownerId(ownerId)
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
