package ac.ca.cput.factory.people;

import ac.ca.cput.model.people.PharmacyClerk;

public class PharmacyClerkFactory {

    public static PharmacyClerk getPharmacyClerk(String clerkId,String firstName,String lastName) {
        return new PharmacyClerk.Builder().clerkId(clerkId)
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }

}
