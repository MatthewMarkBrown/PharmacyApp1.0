package ac.ca.cput.controller.people;

import ac.ca.cput.model.people.Customer;
import ac.ca.cput.service.people.impl.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/PharmacyApp/customer")
public class CustomerController {
    @Autowired
    @Qualifier("ServiceImp")
    private CustomerServiceImp service;

    @PostMapping("/create")
    @ResponseBody
    public Customer create(Customer customer) {
        return service.create(customer);
    }

    @PostMapping("/update")
    @ResponseBody
    public Customer update(Customer customer) {
        return service.update(customer);
    }

    @GetMapping("/delete/{custId}")
    @ResponseBody
    public void delete(@PathVariable String custId) {
        service.delete(custId);

    }

    @GetMapping("/read/{custId}")
    @ResponseBody
    public Customer read(@PathVariable String custId) {
        return service.read(custId);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Customer> getAll(){
        return service.getAll();
    }
}
