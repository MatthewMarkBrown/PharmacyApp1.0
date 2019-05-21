package ac.ca.cput.RepositoryImpTest.People;

import ac.ca.cput.Repository.people.impl.OwnerRepositoryImp;
import ac.ca.cput.factory.people.OwnerFactory;
import ac.ca.cput.model.people.Owner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OwnerImpTest {
    private OwnerRepositoryImp repository;
    private Owner owner;

    private Owner getSavedOwner() {
        Set<Owner> savedOwner = this.repository.getAll();
        return savedOwner.iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.repository= OwnerRepositoryImp.getRepo();
        this.owner = OwnerFactory.getOwner("Owner id","Name","Lastname");
    }

    @Test
    public void d_getAll() {
        Set<Owner> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

    @Test
    public void a_create() {
        Owner created = this.repository.create(this.owner);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.owner);
    }

    @Test
    public void b_read() {
        Owner savedOwner = getSavedOwner();
        System.out.println("In read, ownerId = "+ savedOwner.getOwnerId());
        Owner read = this.repository.read(savedOwner.getOwnerId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedOwner, read);
    }

    @Test
    public void e_delete() {
        Owner savedCourse = getSavedOwner();
        this.repository.delete(savedCourse.getOwnerId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "New Test ownerID";
        Owner owner = new Owner.Builder().copy(getSavedOwner()).ownerId(newname).build();
        System.out.println("In update, about_to_updated = " + owner);
        Owner updated = this.repository.update(owner);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getOwnerId());
        d_getAll();
    }





}
