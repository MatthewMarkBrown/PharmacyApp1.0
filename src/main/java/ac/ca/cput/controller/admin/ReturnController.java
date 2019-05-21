package ac.ca.cput.controller.admin;

import ac.ca.cput.model.admin.Return;
import ac.ca.cput.service.admin.impl.ReturnServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/PharmacyApp/pharmacy")
public class ReturnController {
    @Autowired
    @Qualifier("ServiceImp")
    private ReturnServiceImp service;

    @PostMapping("/create")
    @ResponseBody
    public Return create(Return return1) {
        return service.create(return1);
    }

    @PostMapping("/update")
    @ResponseBody
    public Return update(Return return1) {
        return service.update(return1);
    }

    @GetMapping("/delete/{quantity}")
    @ResponseBody
    public void delete(@PathVariable String quantity) {
        service.delete(quantity);

    }

    @GetMapping("/read/{pharmacyId}")
    @ResponseBody
    public Return read(@PathVariable String quantity) {
        return service.read(quantity);
    }


    @GetMapping("/getall")
    @ResponseBody
    public Set<Return> getAll(){
        return service.getAll();
    }
}
