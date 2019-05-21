package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.ReturnRepository;
import ac.ca.cput.model.admin.Return;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ReturnRepositoryImp implements ReturnRepository {
    private static ReturnRepositoryImp repo = null;
    private Set<Return> ret;

    private ReturnRepositoryImp(){
        this.ret = new HashSet<>();
    }

    public static ReturnRepositoryImp getRepo(){
        if (repo == null){
            repo = new ReturnRepositoryImp();
        }
        return repo;
    }

    @Override
    public Return create(Return return1) {
        this.ret.add(return1);
        return return1;
    }

    @Override
    public Return update(Return return1) {
        if(!return1.equals(null)){
            return return1;
        }
        return null;
    }

    @Override
    public void delete(String t) {
        for(Iterator<Return> ite = ret.iterator(); ite.hasNext(); ){
            Return r = ite.next();
            if (r.equals(new Return.Builder().quantity(t))){
                this.ret.remove(r);
            }
        }

    }

    @Override
    public Return read(String id) {
        return null;
    }

    @Override
    public Set <Return> getAll(){
        return this.ret;
    }

}

