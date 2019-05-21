package ac.ca.cput.controller.admin;

import ac.ca.cput.model.admin.OrderStatus;
import ac.ca.cput.service.admin.impl.OrderStatusServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/PharmacyApp/orderStatus")
public class OrderStatusController {
    @Autowired
    @Qualifier("ServiceImp")
    private OrderStatusServiceImp service;

    @PostMapping("/create")
    @ResponseBody
    public OrderStatus create(OrderStatus orderStatus) {
        return service.create(orderStatus);
    }

    @PostMapping("/update")
    @ResponseBody
    public OrderStatus update(OrderStatus orderStatus) {
        return service.update(orderStatus);
    }

    @GetMapping("/delete/{orderStatusId}")
    @ResponseBody
    public void delete(@PathVariable String orderStatusId) {
        service.delete(orderStatusId);

    }

    @GetMapping("/read/{orderStatusId}")
    @ResponseBody
    public OrderStatus read(@PathVariable String orderStatusId) {
        return service.read(orderStatusId);
    }


    @GetMapping("/getall")
    @ResponseBody
    public Set<OrderStatus> getAll(){
        return service.getAll();
    }
}
