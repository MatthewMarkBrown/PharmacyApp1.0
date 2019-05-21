package ac.ca.cput.service.admin;

import ac.ca.cput.model.admin.Return;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface ReturnService extends IService<Return,String> {
Set<Return> getAll();
}
