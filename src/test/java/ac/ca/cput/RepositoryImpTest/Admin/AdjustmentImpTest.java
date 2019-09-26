//package ac.ca.cput.RepositoryImpTest.Admin;
//import ac.ca.cput.Repository.people.impl.AdjustmentRepositoryImp;
//import ac.ca.cput.factory.admin.AdjustmentFactory;
//import ac.ca.cput.model.admin.Adjustment;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import java.util.Set;
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//
//public class AdjustmentImpTest {
//    private Adjustment adjustment;
//    private AdjustmentRepositoryImp repo;
//
//    private Adjustment getSavedAdjustment() {
//        Set<Adjustment> savedAdjustment = this.repo.getAll();
//        return savedAdjustment.iterator().next();
//    }
//
//
//    @Before
//    public void setUp() throws Exception{
//    this.repo = AdjustmentRepositoryImp.getRepo();
//    this.adjustment = AdjustmentFactory.getExpectedCount("Test Adjustment");
//}
//
//    public void a_create() {
//        Adjustment created = this.repo.create(this.adjustment);
//        System.out.println("In create, created = " + created);
//        d_getAll();
//        Assert.assertSame(created, this.adjustment);
//    }
//
//    @Test
//    public void b_read() {
//        Adjustment savedAdjustment = getSavedAdjustment();
//        System.out.println("In read, expectedCount = "+ savedAdjustment.getExpectedCount());
//        Adjustment read = this.repo.read(savedAdjustment.getExpectedCount());
//        System.out.println("In read, read = " + read);
//        d_getAll();
//        Assert.assertEquals(savedAdjustment, read);
//    }
//    @Test
//    public void c_update() {
//        String newname = "New Test Adjustment";
//        Adjustment adjustment = new Adjustment.Builder().copy(getSavedAdjustment()).expectedCount(newname).build();
//        System.out.println("In update, about_to_updated = " + adjustment);
//        Adjustment updated = this.repo.update(adjustment);
//        System.out.println("In update, updated = " + updated);
//        Assert.assertSame(newname, updated.getExpectedCount());
//        d_getAll();
//    }
//
//    @Test
//    public void d_getAll() {
//        Set<Adjustment> all = this.repo.getAll();
//        System.out.println("In getAll, all = " + all);
//    }
//
//
//
//}
