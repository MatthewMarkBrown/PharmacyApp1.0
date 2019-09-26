//package ac.ca.cput.controller.people;
//
//import ac.ca.cput.model.people.Owner;
//import ac.ca.cput.service.people.impl.OwnerServiceImp;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//@RestController
//@RequestMapping("/PharmacyApp/owner")
//public class OwnerController {
//    @Autowired
//    @Qualifier("ServiceImp")
//    private OwnerServiceImp service;
//
//    @PostMapping("/create")
//    @ResponseBody
//    public Owner create(Owner owner) {
//        return service.create(owner);
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Owner update(Owner owner) {
//        return service.update(owner);
//    }
//
//    @GetMapping("/delete/{ownerId}")
//    @ResponseBody
//    public void delete(@PathVariable String ownerId) {
//        service.delete(ownerId);
//
//    }
//
//    @GetMapping("/read/{ownerId}")
//    @ResponseBody
//    public Owner read(@PathVariable String ownerId) {
//        return service.read(ownerId);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Owner> getAll(){
//        return service.getAll();
//    }
//}
