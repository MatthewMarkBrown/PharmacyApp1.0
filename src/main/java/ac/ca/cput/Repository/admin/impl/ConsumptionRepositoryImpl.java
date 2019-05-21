package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.ConsumptionRepository;
import ac.ca.cput.model.admin.Consumption;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConsumptionRepositoryImpl implements ConsumptionRepository {

    private static ConsumptionRepositoryImpl repo = null;
    private Set<Consumption> con;

    private ConsumptionRepositoryImpl(){
        this.con = new HashSet<>();
    }

    public static ConsumptionRepositoryImpl getRepo(){
        if (repo == null){
            repo = new ConsumptionRepositoryImpl();
        }
        return repo;
    }

    @Override
    public Set<Consumption> getAll() {
        return this.con;
    }

    @Override
    public Consumption create(Consumption consumption) {
        this.con.add(consumption);
        return consumption;
    }

    @Override
    public Consumption update(Consumption consumption) {
        if(!consumption.equals(null)) {
            return consumption;
        }
        return null;
    }

    @Override
    public void delete(String t) {
        for(Iterator<Consumption> ite = con.iterator(); ite.hasNext(); ) {
            Consumption c = ite.next();
            if (c.equals(new Consumption.Builder().quantity(t))) {
                this.con.remove(c);
            }
        }
    }

    @Override
    public Consumption read(String id) {
        return null;
    }


    //  private Consumption findConsumption(String quantity){
    //    return this.con.stream()
      //          .filter(con -> con.getQuantity().trim().equals(quantity))
        //        .findAny()
          //      .orElse(null);
   // }

    //public Consumption create(Consumption consumption) {
      //  this.con

    //}

}
