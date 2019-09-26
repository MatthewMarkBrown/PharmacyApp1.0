package ac.ca.cput.Repository.people.impl;

import ac.ca.cput.Repository.admin.AdjustmentRepository;
import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.model.admin.Adjustment;
import ac.ca.cput.model.people.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Repository("AdjustmentInMemory")
public class AdjustmentRepositoryImp implements AdjustmentRepository {
    private static AdjustmentRepositoryImp repo = null;
    private Set<Adjustment> adj;

    private AdjustmentRepositoryImp(){

        this.adj = new HashSet<>();
    }

    public static AdjustmentRepositoryImp getRepo(){
        if (repo == null){
            repo = new AdjustmentRepositoryImp();
        }
        return repo;
    }

    @Override
    public Adjustment create(Adjustment adjustment) {
        this.adj.add(adjustment);
        return adjustment;
    }

    @Override
    public Adjustment update(Adjustment adjustment) {
        Adjustment inDB = read(adjustment.getExpectedCount());

        if(inDB != null){
            adj.remove(inDB);
            adj.add(adjustment);
            return adjustment;
        }
        return null;
    }


    @Override
    public void delete(String id) {
        Adjustment inDB = read(id);
        adj.remove(inDB);
    }

    @Override
    public Adjustment read(String id) {
        return adj.stream().filter( adj -> adj.getExpectedCount().equals(id)).findAny().orElse(null);
    }

    @Override
    public Set <Adjustment> getAll(){
        return this.adj;
    }
}
