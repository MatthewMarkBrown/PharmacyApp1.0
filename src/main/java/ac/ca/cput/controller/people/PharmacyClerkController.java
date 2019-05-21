package ac.ca.cput.controller.people;

import ac.ca.cput.model.people.PharmacyClerk;
import ac.ca.cput.service.people.impl.PharmacyClerkServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/PharmacyApp/pharmacyClerk")
public class PharmacyClerkController {
    @Autowired
    @Qualifier("ServiceImp")
    private PharmacyClerkServiceImp service;

    @PostMapping("/create")
    @ResponseBody
    public PharmacyClerk create(PharmacyClerk pharmacyClerk) {
        return service.create(pharmacyClerk);
    }

    @PostMapping("/update")
    @ResponseBody
    public PharmacyClerk update(PharmacyClerk pharmacyClerk) {
        return service.update(pharmacyClerk);
    }

    @GetMapping("/delete/{clerkId}")
    @ResponseBody
    public void delete(@PathVariable String clerkId) {
        service.delete(clerkId);

    }

    @GetMapping("/read/{clerkId}")
    @ResponseBody
    public PharmacyClerk read(@PathVariable String clerkId) {
        return service.read(clerkId);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<PharmacyClerk> getAll(){
        return service.getAll();
    }
}
