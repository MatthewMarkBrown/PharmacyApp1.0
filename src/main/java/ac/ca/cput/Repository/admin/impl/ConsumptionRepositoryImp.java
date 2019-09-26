package ac.ca.cput.Repository.admin.impl;
import ac.ca.cput.Repository.admin.ConsumptionRepository;
import ac.ca.cput.Repository.admin.ShipmentRepository;
import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.model.admin.Consumption;
import ac.ca.cput.model.admin.Shipment;
import ac.ca.cput.model.people.Customer;
import org.springframework.stereotype.Repository;
import sun.awt.SunHints;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Repository("ConsumptionInMemory")
public class ConsumptionRepositoryImp implements ConsumptionRepository {
    private static ConsumptionRepositoryImp repo = null;
    private Set<Consumption> con;

    private ConsumptionRepositoryImp(){

        this.con = new HashSet<>();
    }

    public static ConsumptionRepositoryImp getRepo(){
        if (repo == null){
            repo = new ConsumptionRepositoryImp();
        }
        return repo;
    }

    @Override
    public Consumption create(Consumption consumption) {
        this.con.add(consumption);
        return consumption;
    }

    @Override
    public Consumption update(Consumption consumption) {
        Consumption inDB = read(consumption.getQuantity());

        if(inDB != null){
            con.remove(inDB);
            con.add(consumption);
            return consumption;
        }
        return null;
    }


    @Override
    public void delete(String id) {
        Consumption inDB = read(id);
        con.remove(inDB);
    }

    @Override
    public Consumption read(String id) {
        return con.stream().filter( con -> con.getQuantity().equals(id)).findAny().orElse(null);
    }

    @Override
    public Set <Consumption> getAll(){
        return this.con;
    }
}

