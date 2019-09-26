//package ac.ca.cput.Service.Admin;
//
//import ac.ca.cput.Repository.admin.impl.PharmacyRepositoryImp;
//import ac.ca.cput.factory.admin.PharmacyFactory;
//import ac.ca.cput.model.admin.Pharmacy;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import java.util.Set;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class PharmacyServiceTesting {
//    private PharmacyRepositoryImp repository;
//    private Pharmacy pharmacy;
//
//    private Pharmacy getSavedPharmacy() {
//        Set<Pharmacy> savedPharmacy = this.repository.getAll();
//        return savedPharmacy.iterator().next();
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository= PharmacyRepositoryImp.getRepo();
//        this.pharmacy = PharmacyFactory.getPharmacy("Test ID","NAME");
//    }
//
//    @Test
//    public void d_getAll() {
//        Set<Pharmacy> all = this.repository.getAll();
//        System.out.println("In getAll, all = " + all);
//    }
//
//    @Test
//    public void a_create() {
//        Pharmacy created = this.repository.create(this.pharmacy);
//        System.out.println("In create, created = " + created);
//        Assert.assertNotNull(created);
//        Assert.assertSame(created, this.pharmacy);
//    }
//
//    @Test
//    public void b_read() {
//        Pharmacy savedPharmacy = getSavedPharmacy();
//        System.out.println("In read, pharmId = "+ savedPharmacy.getPharmacyId());
//        Pharmacy read = this.repository.read(savedPharmacy.getPharmacyId());
//        System.out.println("In read, read = " + read);
//        Assert.assertEquals(savedPharmacy, read);
//    }
//
//    @Test
//    public void e_delete() {
//        Pharmacy savedPharmacy = getSavedPharmacy();
//        this.repository.delete(savedPharmacy.getPharmacyId());
//        d_getAll();
//    }
//
//    @Test
//    public void c_update() {
//        String newname = "New Test Course Name";
//        Pharmacy pharmacy = new Pharmacy.Builder().copy(getSavedPharmacy()).pharmacyId(newname).build();
//        System.out.println("In update, about_to_updated = " + pharmacy);
//        Pharmacy updated = this.repository.update(pharmacy);
//        System.out.println("In update, updated = " + updated);
//        Assert.assertSame(newname, updated.getPharmacyId());
//    }
//}
