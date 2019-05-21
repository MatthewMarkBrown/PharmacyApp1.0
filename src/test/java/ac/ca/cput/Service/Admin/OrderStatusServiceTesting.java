package ac.ca.cput.Service.Admin;

import ac.ca.cput.Repository.admin.impl.OrderStatusRepositoryImp;
import ac.ca.cput.factory.admin.OrderStatusFactory;
import ac.ca.cput.model.admin.OrderStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderStatusServiceTesting {
    private OrderStatusRepositoryImp repository;
    private OrderStatus orderStatus;

    private OrderStatus getSavedOrderStatus() {
        Set<OrderStatus> savedOrderStatus = this.repository.getAll();
        return savedOrderStatus.iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.repository = OrderStatusRepositoryImp.getRepo();
        this.orderStatus = OrderStatusFactory.statusId("Test status ID");
    }

    @Test
    public void d_getAll() {
        Set<OrderStatus> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

    @Test
    public void a_create() {
        OrderStatus created = this.repository.create(this.orderStatus);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.orderStatus);
    }

    @Test
    public void b_read() {
        OrderStatus savedOrderStatus = getSavedOrderStatus();
        System.out.println("In read, statusId = "+ savedOrderStatus.getStatusId());
        OrderStatus read = this.repository.read(savedOrderStatus.getStatusId());
        System.out.println("In read, read = " + read);
        Assert.assertEquals(savedOrderStatus, read);
    }

    @Test
    public void e_delete() {
        OrderStatus savedOrderStatus = getSavedOrderStatus();
        this.repository.delete(savedOrderStatus.getStatusId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "New Test StatusID";
        OrderStatus orderStatus = new OrderStatus.Builder().copy(getSavedOrderStatus()).statusId(newname).build();
        System.out.println("In update, about_to_updated = " + orderStatus);
        OrderStatus updated = this.repository.update(orderStatus);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getStatusId());
    }
}
