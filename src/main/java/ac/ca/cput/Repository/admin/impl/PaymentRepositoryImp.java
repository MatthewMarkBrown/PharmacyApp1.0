//package ac.ca.cput.Repository.admin.impl;
//
//
//import ac.ca.cput.Repository.admin.*;
//import ac.ca.cput.Repository.people.CustomerRepository;
//import ac.ca.cput.model.admin.*;
//import ac.ca.cput.model.people.Customer;
//import org.springframework.stereotype.Repository;
//import sun.awt.SunHints;
//
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//
//@Repository("PaymentInMemory")
//public class PaymentRepositoryImp implements PaymentRepository {
//    private static PaymentRepositoryImp repo = null;
//    private Set<Payment> pay;
//
//    private PaymentRepositoryImp(){
//
//        this.pay = new HashSet<>();
//    }
//
//    public static PaymentRepositoryImp getRepo(){
//        if (repo == null){
//            repo = new PaymentRepositoryImp();
//        }
//        return repo;
//    }
//
//    @Override
//    public Payment create(Payment payment) {
//        this.pay.add(payment);
//        return payment;
//    }
//
//    @Override
//    public Payment update(Payment payment) {
//        Payment inDB = read(payment.getPaymentId());
//
//        if(inDB != null){
//            pay.remove(inDB);
//            pay.add(payment);
//            return payment;
//        }
//        return null;
//    }
//
//
//    @Override
//    public void delete(String id) {
//        Payment inDB = read(id);
//        pay.remove(inDB);
//    }
//
//    @Override
//    public Payment read(String id) {
//        return pay.stream().filter( pay-> pay.getPaymentId().equals(id)).findAny().orElse(null);
//    }
//
//    @Override
//    public Set<Payment> getAll(){
//        return this.pay;
//    }
//}
