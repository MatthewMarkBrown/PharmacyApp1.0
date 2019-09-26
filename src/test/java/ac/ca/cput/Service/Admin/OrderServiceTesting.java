//package ac.ca.cput.Service.Admin;
//
//import ac.ca.cput.Repository.admin.impl.OrderRepositoryImp;
//import ac.ca.cput.factory.admin.OrderFactory;
//import ac.ca.cput.model.admin.Order;
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
//public class OrderServiceTesting {
//    private OrderRepositoryImp repository;
//    private Order order;
//
//    private Order getSavedOrder() {
//        Set<Order> savedOrder = this.repository.getAll();
//        return savedOrder.iterator().next();
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = OrderRepositoryImp.getRepo();
//        this.order = OrderFactory.getOrder("Test id","Test order name","Test order type");
//
//    }
//
//    @Test
//    public void d_getAll() {
//        Set<Order> all = this.repository.getAll();
//        System.out.println("In getAll, all = " + all);
//    }
//
//    @Test
//    public void a_create() {
//        Order created = this.repository.create(this.order);
//        System.out.println("In create, created = " + created);
//        Assert.assertNotNull(created);
//        Assert.assertSame(created, this.order);
//    }
//    @Test
//    public void b_read() {
//        Order savedOrder = getSavedOrder();
//        System.out.println("In read, courseId = "+ savedOrder.getOrderId());
//        Order read = this.repository.read(savedOrder.getOrderId());
//        System.out.println("In read, read = " + read);
//        Assert.assertEquals(savedOrder, read);
//    }
//
//    @Test
//    public void e_delete() {
//        Order savedOrder = getSavedOrder();
//        this.repository.delete(savedOrder.getOrderId());
//        d_getAll();
//    }
//
//    @Test
//    public void c_update() {
//        String newname = "New Test OrderId";
//        Order order = new Order.Builder().copy(getSavedOrder()).orderId(newname).build();
//        System.out.println("In update, about_to_updated = " + order);
//        Order updated = this.repository.update(order);
//        System.out.println("In update, updated = " + updated);
//        Assert.assertSame(newname, updated.getOrderId());
//    }
//}
