package ac.ca.cput.Repository.people.impl;

import ac.ca.cput.Repository.admin.ShipmentRepository;
import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.model.admin.Shipment;
import ac.ca.cput.model.people.Customer;
import org.springframework.stereotype.Repository;
import sun.awt.SunHints;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Repository("ShipmentInMemory")
public class ShipmentRepositoryImp implements ShipmentRepository {
    private static ShipmentRepositoryImp repo = null;
    private Set<Shipment> ship;

    private ShipmentRepositoryImp(){

        this.ship = new HashSet<>();
    }

    public static ShipmentRepositoryImp getRepo(){
        if (repo == null){
            repo = new ShipmentRepositoryImp();
        }
        return repo;
    }

    @Override
    public Shipment create(Shipment shipment) {
        this.ship.add(shipment);
        return shipment;
    }

    @Override
    public Shipment update(Shipment shipment) {
        Shipment inDB = read(shipment.getShipmentId());

        if(inDB != null){
            ship.remove(inDB);
            ship.add(shipment);
            return shipment;
        }
        return null;
    }


    @Override
    public void delete(String id) {
        Shipment inDB = read(id);
        ship.remove(inDB);
    }

    @Override
    public Shipment read(String id) {
        return ship.stream().filter( ship -> ship.getShipmentId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Set <Shipment> getAll(){
        return this.ship;
    }
}
