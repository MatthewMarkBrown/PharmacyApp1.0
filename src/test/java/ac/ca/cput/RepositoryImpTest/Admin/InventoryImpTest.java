package ac.ca.cput.RepositoryImpTest.Admin;

import ac.ca.cput.Repository.admin.impl.InventoryRepositoryImp;
import ac.ca.cput.factory.admin.InventoryFactory;
import ac.ca.cput.model.admin.Inventory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InventoryImpTest {
    private InventoryRepositoryImp repository;
    private Inventory inventory;

    private Inventory getSavedInventory() {
        Set<Inventory> savedInventory = this.repository.getAll();
        return savedInventory.iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.repository= InventoryRepositoryImp.getRepo();
        this.inventory = InventoryFactory.getInventory("Test Inventory","Test Code");
    }

    @Test
    public void d_getAll() {
        Set<Inventory> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

    @Test
    public void a_create() {
        Inventory created = this.repository.create(this.inventory);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.inventory);
    }

    @Test
    public void b_read() {
        Inventory savedInventory = getSavedInventory();
        System.out.println("In read, location = "+ savedInventory.getLocation());
        Inventory read = this.repository.read(savedInventory.getLocation());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedInventory, read);
    }

    @Test
    public void e_delete() {
        Inventory savedInventory = getSavedInventory();
        this.repository.delete(savedInventory.getLocation());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "New Test Location";
        Inventory inventory = new Inventory.Builder().copy(getSavedInventory()).location(newname).build();
        System.out.println("In update, about_to_updated = " + inventory);
        Inventory updated = this.repository.update(inventory);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getLocation());
        d_getAll();
    }



}
