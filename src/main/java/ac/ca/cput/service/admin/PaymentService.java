package ac.ca.cput.service.admin;

import ac.ca.cput.model.admin.Payment;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface PaymentService extends IService<Payment,String> {
Set<Payment> getAll();
}
