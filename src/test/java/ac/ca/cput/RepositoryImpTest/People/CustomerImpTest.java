package ac.ca.cput.RepositoryImpTest.People;

import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
import ac.ca.cput.factory.people.CustomerFactory;
import ac.ca.cput.model.people.Customer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerImpTest {
    private CustomerRepositoryImp repository;
    private Customer customer;

    private Customer getSavedCustomer() {
        Set<Customer> savedCustomer = this.repository.getAll();
        return savedCustomer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = CustomerRepositoryImp.getRepo();
        this.customer = CustomerFactory.getCustomer("1","Matthew","Brown");
    }


    @Test
    public void d_getAll() {
        Set<Customer> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

    @Test
    public void a_create() {
        Customer created = this.repository.create(this.customer);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.customer);
    }

    @Test
    public void b_read() {
        Customer savedCustomer = getSavedCustomer();
        System.out.println("In read, custId = "+ savedCustomer.getCustId());
        Customer read = this.repository.read(savedCustomer.getCustId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedCustomer, read);
    }

    @Test
    public void e_delete() {
        Customer savedCustomer = getSavedCustomer();
        this.repository.delete(savedCustomer.getCustId());
        d_getAll();
    }

    @Test
    public void c_update() {
//        String newname = "New Test Customer";
//        Customer customer = new Customer.Builder().copy(getSavedCustomer()).custId(newname).build();
//        System.out.println("In update, about_to_updated = " + customer);
//        Customer updated = this.repository.update(customer);
//        System.out.println("In update, updated = " + updated);
//        Assert.assertSame(newname, updated.getCustId());
//        d_getAll();
    }



}
