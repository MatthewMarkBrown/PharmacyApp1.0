package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.PharmacyRepository;
import ac.ca.cput.Repository.admin.ReturnRepository;
import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.PharmacyClerkRepository;
import ac.ca.cput.model.admin.Pharmacy;
import ac.ca.cput.model.admin.Return;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.model.people.PharmacyClerk;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Repository("ReturnInMemory")
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
        Return inDB = read(return1.getQuantity());

        if(inDB != null){
            ret.remove(inDB);
            ret.add(return1);
            return return1;
        }
        return null;
    }


    @Override
    public void delete(String id) {
        Return inDB = read(id);
        ret.remove(inDB);
    }

    @Override
    public Return read(String id) {
        return ret.stream().filter( ret -> ret.getQuantity().equals(id)).findAny().orElse(null);
    }

    @Override
    public Set <Return> getAll(){
        return this.ret;
    }
}
