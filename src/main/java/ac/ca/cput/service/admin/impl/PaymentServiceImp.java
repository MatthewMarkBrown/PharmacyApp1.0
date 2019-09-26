//package ac.ca.cput.service.admin.impl;
//
//import ac.ca.cput.Repository.admin.PaymentRepository;
//import ac.ca.cput.Repository.admin.impl.PaymentRepositoryImp;
//import ac.ca.cput.model.admin.Payment;
//import ac.ca.cput.service.admin.PaymentService;
//
//import java.util.Set;
//
//public class PaymentServiceImp implements PaymentService {
//    private static PaymentServiceImp service = null;
//    private PaymentRepository repo;
//
//    private PaymentServiceImp() {
//        this.repo = (PaymentRepository) PaymentRepositoryImp.getRepo();
//    }
//
//    public static PaymentServiceImp getService(){
//        if(service == null) service = new PaymentServiceImp();
//        return service;
//    }
//
//
//    @Override
//    public Set<Payment> getAll() {
//        return this.repo.getAll();
//    }
//
//    @Override
//    public Payment create(Payment payment) {
//        return this.repo.create(payment);
//    }
//
//    @Override
//    public Payment update(Payment payment) {
//        return this.repo.update(payment);
//    }
//
//    @Override
//    public void delete(String id) {
//    this.repo.delete(id);
//    }
//
//    @Override
//    public Payment read(String id) {
//        return this.repo.read(id);
//    }
//}
