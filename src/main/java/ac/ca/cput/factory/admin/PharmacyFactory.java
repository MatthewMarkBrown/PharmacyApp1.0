package ac.ca.cput.factory.admin;

import ac.ca.cput.model.admin.Pharmacy;

public class PharmacyFactory {
    public static Pharmacy getPharmacy(String pharmId, String name) {
        return new Pharmacy.Builder().pharmacyId(pharmId)
                .pharmacyName(name)
                .build();

    }
}