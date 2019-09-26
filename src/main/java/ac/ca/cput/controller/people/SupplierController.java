//package ac.ca.cput.controller.people;
//
//import ac.ca.cput.model.people.Supplier;
//import ac.ca.cput.service.people.impl.SupplierServiceImp;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//@RestController
//@RequestMapping("/PharmacyApp/supplier")
//public class SupplierController {
//    @Autowired
//    @Qualifier("ServiceImp")
//    private SupplierServiceImp service;
//
//    @PostMapping("/create")
//    @ResponseBody
//    public Supplier create(Supplier supplier) {
//        return service.create(supplier);
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Supplier update(Supplier supplier) {
//        return service.update(supplier);
//    }
//
//    @GetMapping("/delete/{supplierId}")
//    @ResponseBody
//    public void delete(@PathVariable String supplierId) {
//        service.delete(supplierId);
//
//    }
//
//    @GetMapping("/read/{suppplierId}")
//    @ResponseBody
//    public Supplier read(@PathVariable String supplierId) {
//        return service.read(supplierId);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Supplier> getAll(){
//        return service.getAll();
//    }
//}
