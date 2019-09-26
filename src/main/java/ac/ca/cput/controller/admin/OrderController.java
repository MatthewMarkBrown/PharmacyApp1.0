//package ac.ca.cput.controller.admin;
//
//import ac.ca.cput.model.admin.Order;
//import ac.ca.cput.service.admin.impl.OrderServiceImp;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//@RestController
//@RequestMapping("/PharmacyApp/order")
//
//public class OrderController {
//    @Autowired
//    @Qualifier("ServiceImp")
//    private OrderServiceImp service;
//
//    @PostMapping("/create")
//    @ResponseBody
//    public Order create(Order order) {
//        return service.create(order);
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Order update(Order order) {
//        return service.update(order);
//    }
//
//    @GetMapping("/delete/{orderId}")
//    @ResponseBody
//    public void delete(@PathVariable String orderId) {
//        service.delete(orderId);
//
//    }
//
//    @GetMapping("/read/{orderId}")
//    @ResponseBody
//    public Order read(@PathVariable String orderId) {
//        return service.read(orderId);
//    }
//
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Order> getAll(){
//        return service.getAll();
//    }
//}
