package ac.ca.cput.RepositoryImpTest.People;

import ac.ca.cput.Repository.people.impl.PharmacyClerkRepositoryImp;
import ac.ca.cput.factory.people.PharmacyClerkFactory;
import ac.ca.cput.model.people.PharmacyClerk;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PharmacyClerkImpTest {
    private PharmacyClerkRepositoryImp repository;
    private PharmacyClerk pharmacyClerk;

    private PharmacyClerk getSavedPharmacyClerk() {
        Set<PharmacyClerk> savedPharmacyClerk = this.repository.getAll();
        return savedPharmacyClerk.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository= PharmacyClerkRepositoryImp.getRepo();
        this.pharmacyClerk =  PharmacyClerkFactory.getPharmacyClerk("ID","Name","lastname");
    }

    @Test
    public void d_getAll() {
        Set<PharmacyClerk> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

    @Test
    public void a_create() {
        PharmacyClerk created = this.repository.create(this.pharmacyClerk);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.pharmacyClerk);
    }

    @Test
    public void b_read() {
        PharmacyClerk savedPharmacyClerk = getSavedPharmacyClerk();
        System.out.println("In read, clerkId = "+ savedPharmacyClerk.getClerkId());
        PharmacyClerk read = this.repository.read(savedPharmacyClerk.getClerkId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedPharmacyClerk, read);
    }

    @Test
    public void e_delete() {
        PharmacyClerk savedPharmacyClerk = getSavedPharmacyClerk();
        this.repository.delete(savedPharmacyClerk.getClerkId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "New Test Course Name";
        PharmacyClerk pharmacyClerk = new PharmacyClerk.Builder().copy(getSavedPharmacyClerk()).clerkId(newname).build();
        System.out.println("In update, about_to_updated = " + pharmacyClerk);
        PharmacyClerk updated = this.repository.update(pharmacyClerk);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getClerkId());
        d_getAll();
    }
}
