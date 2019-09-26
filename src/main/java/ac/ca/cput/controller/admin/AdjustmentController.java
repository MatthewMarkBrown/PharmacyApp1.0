//package ac.ca.cput.controller.admin;
//
//import ac.ca.cput.model.admin.Adjustment;
//import ac.ca.cput.service.admin.impl.AdjustmentServiceImp;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//@RestController
//@RequestMapping("/PharmacyApp/adjustment")
//public class AdjustmentController {
//    @Autowired
//    @Qualifier("ServiceImp")
//    private AdjustmentServiceImp service;
//
//    @PostMapping("/create")
//    @ResponseBody
//    public Adjustment create(Adjustment adjustment) {
//        return service.create(adjustment);
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Adjustment update(Adjustment adjustment) {
//        return service.update(adjustment);
//    }
//
//    @GetMapping("/delete/{expectedCount}")
//    @ResponseBody
//    public void delete(@PathVariable String expectedCount) {
//        service.delete(expectedCount);
//
//    }
//
//    @GetMapping("/read/{expectedCount}")
//    @ResponseBody
//    public Adjustment read(@PathVariable String expectedCount) {
//        return service.read(expectedCount);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Adjustment> getAll(){
//        return service.getAll();
//    }
//}
