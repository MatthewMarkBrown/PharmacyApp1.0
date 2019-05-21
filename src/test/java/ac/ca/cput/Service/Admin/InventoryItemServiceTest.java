package ac.ca.cput.Service.Admin;

import ac.ca.cput.Repository.admin.impl.InventoryItemRepositoryImp;
import ac.ca.cput.factory.admin.InventoryItemFactory;
import ac.ca.cput.model.admin.InventoryItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class InventoryItemServiceTest {
    private InventoryItemRepositoryImp repository;
    private InventoryItem inventoryItem;


    private InventoryItem getSavedInventoryItem() {
        Set<InventoryItem> savedInventoryItem = this.repository.getAll();
        return savedInventoryItem.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository= InventoryItemRepositoryImp.getRepo();
        this.inventoryItem = InventoryItemFactory.getInventoryItem("Test Inventory Item");
    }

    @Test
    public void d_getAll() {
        Set<InventoryItem> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

    @Test
    public void a_create() {
        InventoryItem created = this.repository.create(this.inventoryItem);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.inventoryItem);

    }
    @Test
    public void b_read() {
        InventoryItem savedInventoryItem = getSavedInventoryItem();
        System.out.println("In read, courseId = "+ savedInventoryItem.getItemCode());
        InventoryItem read = this.repository.read(savedInventoryItem.getItemCode());
        System.out.println("In read, read = " + read);
        Assert.assertEquals(savedInventoryItem, read);
    }

    @Test
    public void c_update() {
        String newname = "New Test Inventory Item code";
        InventoryItem inventoryItem = new InventoryItem.Builder().copy(getSavedInventoryItem()).itemCode(newname).build();
        System.out.println("In update, about_to_updated = " + inventoryItem);
        InventoryItem updated = this.repository.update(inventoryItem);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getItemCode());

    }


    @Test
    public void e_delete() {
        InventoryItem savedInventoryItem = getSavedInventoryItem();
        this.repository.delete(savedInventoryItem.getItemCode());
        d_getAll();
    }
}
