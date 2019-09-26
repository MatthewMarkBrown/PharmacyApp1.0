package ac.ca.cput.RepositoryImpTest.Admin;

import ac.ca.cput.Repository.admin.impl.PaymentRepositoryImp;
import ac.ca.cput.factory.admin.PaymentFactory;
import ac.ca.cput.model.admin.Payment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentImpTest {
    private PaymentRepositoryImp repository;
    private Payment payment;

    private Payment getSavedPayment() {
        Set<Payment> savedPayment = this.repository.getAll();
        return savedPayment.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository= PaymentRepositoryImp.getRepo();
        this.payment= PaymentFactory.getPayment("paymentId");
    }

    @Test
    public void d_getAll() {
        Set<Payment> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

    @Test
    public void a_create() {
        Payment created = this.repository.create(this.payment);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.payment);
    }
    @Test
    public void b_read() {
        Payment savedPayment = getSavedPayment();
        System.out.println("In read, paymentId = "+ savedPayment.getPaymentId());
        Payment read = this.repository.read(savedPayment.getPaymentId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedPayment, read);
    }

    @Test
    public void e_delete() {
        Payment savedPayment = getSavedPayment();
        this.repository.delete(savedPayment.getPaymentId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "New Test Payment ID";
        Payment payment = new Payment.Builder().copy(getSavedPayment()).paymentId(newname).build();
        System.out.println("In update, about_to_updated = " + payment);
        Payment updated = this.repository.update(payment);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname,  "New Test Payment ID" );
        d_getAll();
    }


}
