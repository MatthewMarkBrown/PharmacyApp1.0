package ac.ca.cput.controller.admin;

import ac.ca.cput.model.admin.Inventory;
import ac.ca.cput.service.admin.impl.InventoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/PharmacyApp/inventory")
public class InventoryController {

    @Autowired
    @Qualifier("ServiceImp")
    private InventoryServiceImp service;

    @PostMapping("/create")
    @ResponseBody
    public Inventory create(Inventory inventory) {
        return service.create(inventory);
    }

    @PostMapping("/update")
    @ResponseBody
    public Inventory update(Inventory inventory) {
        return service.update(inventory);
    }

    @GetMapping("/delete/{location}")
    @ResponseBody
    public void delete(@PathVariable String location) {
        service.delete(location);

    }

    @GetMapping("/read/{location}")
    @ResponseBody
    public Inventory read(@PathVariable String location) {
        return service.read(location);
    }


    @GetMapping("/getall")
    @ResponseBody
    public Set<Inventory> getAll(){
        return service.getAll();
    }


}
