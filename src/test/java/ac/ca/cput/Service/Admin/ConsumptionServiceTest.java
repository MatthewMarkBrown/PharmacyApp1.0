package ac.ca.cput.Service.Admin;

import ac.ca.cput.Repository.admin.impl.ConsumptionRepositoryImpl;
import ac.ca.cput.factory.admin.ConsumptionFactory;
import ac.ca.cput.model.admin.Consumption;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConsumptionServiceTest {
    private ConsumptionRepositoryImpl repository;
    private Consumption consumption;

    private Consumption getSavedConsumption() {
        Set<Consumption> savedConsumption = this.repository.getAll();
        return savedConsumption.iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.repository= ConsumptionRepositoryImpl.getRepo();
        this.consumption = ConsumptionFactory.getConsumption("Test Course");
    }

    @Test
    public void d_getAll() {
        Set<Consumption> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

    @Test
    public void a_create() {
        Consumption created = this.repository.create(this.consumption);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.consumption);
    }

    @Test
    public void b_read() {
        Consumption savedConsumption = getSavedConsumption();
        Consumption read = this.repository.read(consumption.getQuantity());
        System.out.println("In read, read = " + read);
        Assert.assertEquals(savedConsumption, read);
    }

    @Test
    public void e_delete() {
        Consumption savedCourse = getSavedConsumption();
        this.repository.delete(savedCourse.getQuantity());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "New Test Consumption";
        Consumption course = new Consumption.Builder().copy(getSavedConsumption()).quantity(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        Consumption updated = this.repository.update(course);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getQuantity());
    }



}
