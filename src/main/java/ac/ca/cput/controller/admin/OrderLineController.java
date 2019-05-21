package ac.ca.cput.controller.admin;

import ac.ca.cput.model.admin.OrderLine;
import ac.ca.cput.service.admin.impl.OrderLineServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/PharmacyApp/orderLine")
public class OrderLineController {
    @Autowired
    @Qualifier("ServiceImp")
    private OrderLineServiceImp service;

    @PostMapping("/create")
    @ResponseBody
    public OrderLine create(OrderLine orderLine) {
        return service.create(orderLine);
    }

    @PostMapping("/update")
    @ResponseBody
    public OrderLine update(OrderLine orderLine) {
        return service.update(orderLine);
    }

    @GetMapping("/delete/{quantity}")
    @ResponseBody
    public void delete(@PathVariable String quantity) {
        service.delete(quantity);

    }

    @GetMapping("/read/{orderStatusId}")
    @ResponseBody
    public OrderLine read(@PathVariable String quantity) {
        return service.read(quantity);
    }


    @GetMapping("/getall")
    @ResponseBody
    public Set<OrderLine> getAll(){
        return service.gerAll();
    }

}
