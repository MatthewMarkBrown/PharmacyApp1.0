package ac.ca.cput.Service.Admin;

import ac.ca.cput.Repository.admin.impl.ShipmentRepositoryImp;
import ac.ca.cput.factory.admin.ShipmentFactory;
import ac.ca.cput.model.admin.Shipment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ShipmentServiceTesting {
    private ShipmentRepositoryImp repository;
    private Shipment shipment;

    private Shipment getSavedShipment() {
        Set<Shipment> savedShipment = this.repository.getAll();
        return savedShipment.iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.repository= ShipmentRepositoryImp.getRepo();
        this.shipment = ShipmentFactory.getShipment("Test Shipment");

    }

    @Test
    public void d_getAll() {
        Set<Shipment> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

    @Test
    public void a_create() {
        Shipment created = this.repository.create(this.shipment);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.shipment);
    }
    @Test
    public void b_read() {
        Shipment savedShipment = getSavedShipment();
        System.out.println("In read, courseId = "+ savedShipment.getShipmentId());
        Shipment read = this.repository.read(savedShipment.getShipmentId());
        System.out.println("In read, read = " + read);
        Assert.assertEquals(savedShipment, read);
    }

    @Test
    public void e_delete() {
        Shipment savedShipment = getSavedShipment();
        this.repository.delete(savedShipment.getShipmentId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "New Test shipment";
        Shipment shipment = new Shipment.Builder().copy(getSavedShipment()).shipmentId(newname).build();
        System.out.println("In update, about_to_updated = " + shipment);
        Shipment updated = this.repository.update(shipment);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getShipmentId());
    }
}
