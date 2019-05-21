package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.AdjustmentRepository;
import ac.ca.cput.model.admin.Adjustment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
    /*private Adjustment findAdjustment(String expectedCount) {
        return this.adj.stream()
                .filter(adjustment->adj.getClass())
                .findAny()
                .orElse(null);
    }
    */
    @Override
    public Set<Adjustment> getAll() {
        return this.adj;
    }

    @Override
    public Adjustment create(Adjustment adjustment) {
        this.adj.add(adjustment);
        return adjustment;
    }

    @Override
    public Adjustment update(Adjustment adjustment) {
        if(!adjustment.equals(null)) {
            return adjustment;
        }
        return null;
        }



    @Override
    public void delete(String s) {
        for(Iterator<Adjustment> ite = adj.iterator(); ite.hasNext(); ){
            Adjustment a = ite.next();
            if (a.equals(new Adjustment.Builder().expectedCount(s))){
                this.adj.remove(a);
            }
        }
    }

    @Override
    public Adjustment read(String id) {
        return null;
    }
}




