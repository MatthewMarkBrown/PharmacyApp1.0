//package ac.ca.cput.controller.admin;
//
//import ac.ca.cput.model.admin.Consumption;
//import ac.ca.cput.service.admin.impl.ConsumptionServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//@RestController
//@RequestMapping("/PharmacyApp/consumption")
//public class ConsumptionController {
//    @Autowired
//    @Qualifier("ServiceImp")
//    private ConsumptionServiceImpl service;
//
//
//    @PostMapping("/create")
//    @ResponseBody
//    public Consumption create(Consumption consumption) {
//        return service.create(consumption);
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Consumption update(Consumption consumption) {
//        return service.update(consumption);
//    }
//
//    @GetMapping("/delete/{quantity}")
//    @ResponseBody
//    public void delete(@PathVariable String quantity) {
//        service.delete(quantity);
//
//    }
//
//    @GetMapping("/read/{quantity}")
//    @ResponseBody
//    public Consumption read(@PathVariable String quantity) {
//        return service.read(quantity);
//    }
//
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Consumption> getAll(){
//        return service.getAll();
//    }
//
//}
