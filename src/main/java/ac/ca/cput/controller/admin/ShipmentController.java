package ac.ca.cput.controller.admin;

import ac.ca.cput.model.admin.Shipment;
import ac.ca.cput.service.admin.impl.ShipmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/PharmacyApp/shipment")
public class ShipmentController {
    @Autowired
    @Qualifier("ServiceImp")
    private ShipmentServiceImp service;

    @PostMapping("/create")
    @ResponseBody
    public Shipment create(Shipment shipment) {
        return service.create(shipment);
    }

    @PostMapping("/update")
    @ResponseBody
    public Shipment update(Shipment shipment) {
        return service.update(shipment);
    }

    @GetMapping("/delete/{shipmentId}")
    @ResponseBody
    public void delete(@PathVariable String shipmentId) {
        service.delete(shipmentId);

    }

    @GetMapping("/read/{shipmentId}")
    @ResponseBody
    public Shipment read(@PathVariable String shipmentId) {
        return service.read(shipmentId);
    }


    @GetMapping("/getall")
    @ResponseBody
    public Set<Shipment> getAll(){
        return service.getAll();
    }
}
