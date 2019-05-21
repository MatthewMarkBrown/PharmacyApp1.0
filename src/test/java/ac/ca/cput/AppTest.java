package ac.ca.cput;

import ac.ca.cput.factory.admin.*;
import ac.ca.cput.factory.people.CustomerFactory;
import ac.ca.cput.factory.people.OwnerFactory;
import ac.ca.cput.factory.people.PharmacyClerkFactory;
import ac.ca.cput.factory.people.SupplierFactory;
import ac.ca.cput.model.admin.*;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.model.people.Owner;
import ac.ca.cput.model.people.PharmacyClerk;
import ac.ca.cput.model.people.Supplier;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getCustomer()
    {
        String firstName = "Matthew";
        Customer c = CustomerFactory.getCustomer(firstName);
        System.out.println(c);
    }

    @Test
    public void getOwner()
    {
        String ownerId = "Matthew";
        Owner o = OwnerFactory.getOwner(ownerId);
        System.out.println(o);
    }

    @Test
    public void getAdjustment()
    {
        int count = 100;
        Adjustment a = AdjustmentFactory.getExpectedCount(100);
        System.out.println(a);
    }


    @Test
    public void getInventory()
    {
        String location = "Cape Town";
        Inventory i = InventoryFactory.getInventory(location);
        System.out.println(i);
    }


    @Test
    public void getInventoryItem(){
        String itemCode = "as5";
        InventoryItem ii = InventoryItemFactory.getInventoryItem(itemCode);
        System.out.println(ii);
    }

    @Test
    public void getOrder(){
        String orderId = "ssd";
        Order ow = OwnerFactory.getOwner(orderId);
        System.out.println(ow);
    }

    @Test
    public void getOrderLine(){
        int quantity = 100;
        OrderLine ol = OrderLineFactory.getOrderLine(100);
        System.out.println(ol);
    }

    @Test
    public void getOrderStatus(){
        int statusId = 100;
        OrderStatus si = OrderStatusFactory.statusId(100);
        System.out.println(si);
    }


    @Test
    public void getPayment(){
        int paymentId = 100;
        Payment a = PaymentFactory.getPayment(100);
        System.out.println(a);
    }

    @Test
    public void getPharmacy(){

        String pharmId = "";
        Pharmacy p = PharmacyFactory.getPharmacy(pharmId);
        System.out.println(p);
    }

    @Test
    public void getPharmacyClerk(){
        String clerkId = "";
        PharmacyClerk p = PharmacyClerkFactory.getPharmacyClerk(clerkId);
        System.out.println(p);
    }

    @Test
    public void getReturn(){
        int quantity = 100;
        Return r = ReturnFactory.getReturn(100);
        System.out.println(r);
    }

    @Test
    public void getShipment(){
        int shipmentId = 100;
        Shipment s = ShipmentFactory.getShipment(100);
        System.out.println(s);
    }


    @Test
    public void getSupplier(){
        String supplierId = "";
        Supplier s = SupplierFactory.getSupplier(supplierId);
        System.out.println(s);
    }

}
