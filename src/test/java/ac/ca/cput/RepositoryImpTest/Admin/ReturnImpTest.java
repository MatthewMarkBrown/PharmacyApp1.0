package ac.ca.cput.RepositoryImpTest.Admin;

import ac.ca.cput.Repository.admin.impl.ReturnRepositoryImp;
import ac.ca.cput.factory.admin.ReturnFactory;
import ac.ca.cput.model.admin.Return;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReturnImpTest {
    private ReturnRepositoryImp repository;
    private Return return1;


    private Return getSavedReturn() {
        Set<Return> savedReturn = this.repository.getAll();
        return savedReturn.iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.repository= ReturnRepositoryImp.getRepo();
        this.return1 = ReturnFactory.getReturn("Test quantity");

    }

    @Test
    public void d_getAll() {
        Set<Return> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

    @Test
    public void create() {
        Return created = this.repository.create(this.return1);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.return1);
    }


    @Test
    public void b_read() {
        Return savedReturn = getSavedReturn();
        System.out.println("In read, QUANTITY = "+ savedReturn.getQuantity());
        Return read = this.repository.read(savedReturn.getQuantity());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedReturn, read);
    }

    @Test
    public void e_delete() {
        Return savedReturn = getSavedReturn();
        this.repository.delete(savedReturn.getQuantity());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "New Test quantity";
        Return return1 = new Return.Builder().copy(getSavedReturn()).quantity(newname).build();
        System.out.println("In update, about_to_updated = " + return1);
        Return updated = this.repository.update(return1);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getQuantity());
        d_getAll();
    }
}
