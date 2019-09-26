//package ac.ca.cput.controller.admin;
//
//import ac.ca.cput.model.admin.Payment;
//import ac.ca.cput.service.admin.impl.PaymentServiceImp;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//@RestController
//@RequestMapping("/PharmacyApp/payment")
//public class PaymentController {
//    @Autowired
//    @Qualifier("ServiceImp")
//    private PaymentServiceImp service;
//
//    @PostMapping("/create")
//    @ResponseBody
//    public Payment create(Payment payment) {
//        return service.create(payment);
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Payment update(Payment payment) {
//        return service.update(payment);
//    }
//
//    @GetMapping("/delete/{paymentId}")
//    @ResponseBody
//    public void delete(@PathVariable String paymentId) {
//        service.delete(paymentId);
//
//    }
//
//    @GetMapping("/read/{pharmacyId}")
//    @ResponseBody
//    public Payment read(@PathVariable String paymentId) {
//        return service.read(paymentId);
//    }
//
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Payment> getAll(){
//        return service.getAll();
//    }
//
//}
