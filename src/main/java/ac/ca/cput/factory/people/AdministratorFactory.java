package ac.ca.cput.factory.people;

import ac.ca.cput.model.people.Administrator;

public class AdministratorFactory {
    public static Administrator getAdministrator(String userID, String firstName, String lastName, String email) {
        return new Administrator.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}
