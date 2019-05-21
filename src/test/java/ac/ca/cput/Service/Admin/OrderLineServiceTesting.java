package ac.ca.cput.Service.Admin;

import ac.ca.cput.Repository.admin.impl.OrderLineRepositoryImp;
import ac.ca.cput.factory.admin.OrderLineFactory;
import ac.ca.cput.model.admin.OrderLine;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderLineServiceTesting {
    private OrderLineRepositoryImp repository;
    private OrderLine orderLine;

    private OrderLine getSavedOrderLine() {
        Set<OrderLine> savedOrderLine = this.repository.getAll();
        return savedOrderLine.iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.repository= OrderLineRepositoryImp.getRepo();
        this.orderLine = OrderLineFactory.getOrderLine("Test quantity");
    }

    @Test
    public void d_getAll() {
        Set<OrderLine> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

    @Test
    public void a_create() {
        OrderLine created = this.repository.create(this.orderLine);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.orderLine);
    }
    @Test
    public void b_read() {
        OrderLine savedOrderLine = getSavedOrderLine();
        System.out.println("In read, quantity = "+ savedOrderLine.getQuantity());
        OrderLine read = this.repository.read(savedOrderLine.getQuantity());
        System.out.println("In read, read = " + read);
        Assert.assertEquals(savedOrderLine, read);
    }

    @Test
    public void e_delete() {
        OrderLine savedCourse = getSavedOrderLine();
        this.repository.delete(savedCourse.getQuantity());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "New Test quantity";
        OrderLine orderLine = new OrderLine.Builder().copy(getSavedOrderLine()).quantity(newname).build();
        System.out.println("In update, about_to_updated = " + orderLine);
        OrderLine updated = this.repository.update(orderLine);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getQuantity());

    }


}
