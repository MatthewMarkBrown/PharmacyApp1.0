package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.ShipmentRepository;
import ac.ca.cput.model.admin.Shipment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
        if(!shipment.equals(null)){
            return shipment;
        }
        return null;
    }

    @Override
    public void delete(String t) {
        for(Iterator<Shipment> ite = ship.iterator(); ite.hasNext(); ){
            Shipment sh = ite.next();
            if (sh.equals(new Shipment.Builder().shipmentId(t))){
                this.ship.remove(sh);
            }
        }
    }

    @Override
    public Shipment read(String id) {
        return null;
    }

    @Override
    public Set <Shipment> getAll(){
        return this.ship;
    }
}
