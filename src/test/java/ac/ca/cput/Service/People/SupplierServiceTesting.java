//package ac.ca.cput.Service.People;
//
//import ac.ca.cput.Repository.people.impl.SupplierRepositoryImp;
//import ac.ca.cput.factory.people.SupplierFactory;
//import ac.ca.cput.model.people.Supplier;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import java.util.Set;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//
//public class SupplierServiceTesting {
//    private SupplierRepositoryImp repository;
//    private Supplier supplier;
//
//
//    private Supplier getSavedSupplier() {
//        Set<Supplier> savedSupplier = this.repository.getAll();
//        return savedSupplier.iterator().next();
//    }
//
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository= SupplierRepositoryImp.getRepo();
//        this.supplier = SupplierFactory.getSupplier("Test id","name");
//    }
//
//    @Test
//    public void d_getAll() {
//        Set<Supplier> all = this.repository.getAll();
//        System.out.println("In getAll, all = " + all);
//    }
//
//    @Test
//    public void a_create() {
//        Supplier created = this.repository.create(this.supplier);
//        System.out.println("In create, created = " + created);
//        Assert.assertNotNull(created);
//        Assert.assertSame(created, this.supplier);
//    }
//
//
//    @Test
//    public void b_read() {
//        Supplier savedSupplier = getSavedSupplier();
//        System.out.println("In read, supplierId = "+ savedSupplier.getSupplierId());
//        Supplier read = this.repository.read(savedSupplier.getSupplierId());
//        System.out.println("In read, read = " + read);
//        Assert.assertEquals(savedSupplier, read);
//    }
//
//    @Test
//    public void e_delete() {
//        Supplier savedSupplier = getSavedSupplier();
//        this.repository.delete(savedSupplier.getSupplierId());
//        d_getAll();
//    }
//
//    @Test
//    public void c_update() {
//        String newname = "New Test Course Name";
//        Supplier supplier = new Supplier.Builder().copy(getSavedSupplier()).supplierId(newname).build();
//        System.out.println("In update, about_to_updated = " + supplier);
//        Supplier updated = this.repository.update(supplier);
//        System.out.println("In update, updated = " + updated);
//        Assert.assertSame(newname, updated.getSupplierId());
//    }
//
//}
