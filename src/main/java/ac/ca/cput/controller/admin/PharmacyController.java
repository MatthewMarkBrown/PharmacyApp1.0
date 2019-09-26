//package ac.ca.cput.controller.admin;
//
//import ac.ca.cput.model.admin.Pharmacy;
//import ac.ca.cput.service.admin.impl.PharmacyServiceImp;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//@RestController
//@RequestMapping("/PharmacyApp/pharmacy")
//public class PharmacyController {
//    @Autowired
//    @Qualifier("ServiceImp")
//    private PharmacyServiceImp service;
//
//    @PostMapping("/create")
//    @ResponseBody
//    public Pharmacy create(Pharmacy pharmacy) {
//        return service.create(pharmacy);
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Pharmacy update(Pharmacy pharmacy) {
//        return service.update(pharmacy);
//    }
//
//    @GetMapping("/delete/{pharmacyId}")
//    @ResponseBody
//    public void delete(@PathVariable String pharmacyId) {
//        service.delete(pharmacyId);
//
//    }
//
//    @GetMapping("/read/{pharmacyId}")
//    @ResponseBody
//    public Pharmacy read(@PathVariable String pharmacyId) {
//        return service.read(pharmacyId);
//    }
//
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Pharmacy> getAll(){
//        return service.getAll();
//    }
//
//}
