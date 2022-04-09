package za.ac.cput.Impl;

import za.ac.cput.Entity.Admin;
import za.ac.cput.Factory.AdminFactory;
import za.ac.cput.repository.AdminIRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdminRepository implements AdminIRepository {
    private static AdminRepository repository = null;
    private Set<Admin> adminSet = null;
    private List<Admin> adminList = null;

    private AdminRepository() {
        adminSet = new HashSet<Admin>();
        adminList = new ArrayList<Admin>();
    }

    public static AdminRepository getRepository(){
        if(repository.equals(null)){
            repository = new AdminRepository();
        }
        return repository;
    }

    @Override
    public List getListAdmins() {
        return null;
    }

    @Override
    public Set getSetAdmins() {
        return null;
    }


    @Override
    public Object create(Object a) {
        boolean success = adminSet.add((Admin) a);
        if(!success)
            return null;
        return a;
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public Object read(Object o) {
        int id = (Integer) o;
        for(Admin a : adminList){
            if(a.getAdminID()==id)
                return (List) a;
        }
        return null;
    }


    @Override
    public boolean delete(Object o) {
        return true;
    }
}
