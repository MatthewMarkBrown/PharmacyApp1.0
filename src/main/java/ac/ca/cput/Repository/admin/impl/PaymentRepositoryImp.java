package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.PaymentRepository;
import ac.ca.cput.model.admin.Payment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PaymentRepositoryImp implements PaymentRepository {
    private static PaymentRepositoryImp repo = null;
    private Set<Payment> pay;

    private PaymentRepositoryImp(){
        this.pay = new HashSet<>();
    }

    public static PaymentRepositoryImp getRepo(){
        if (repo == null){
            repo = new PaymentRepositoryImp();
        }
        return repo;
    }

    @Override
    public Payment create(Payment payment) {
       this.pay.add(payment);
       return payment;
    }

    public Payment update(Payment payment) {
        if(!payment.equals(null)){
            return payment;
        }
        return null;
    }

    @Override
    public void delete(String t) {
        for(Iterator<Payment> ite = pay.iterator(); ite.hasNext(); ){
            Payment p = ite.next();
            if (p.equals(new Payment.Builder().paymentId(t))){
                this.pay.remove(p);
            }
        }
    }

    @Override
    public Payment read(String id) {
        return null;
    }
    @Override
    public Set <Payment> getAll(){
        return this.pay;
    }
}
