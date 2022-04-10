package za.ac.cput.Impl;

import za.ac.cput.Entity.Admin;
import za.ac.cput.repository.AdminIRepository;

import java.util.*;

public class AdminRepository implements AdminIRepository {
    private static AdminRepository repository = null;
    private Set<Admin> adminSet = null;

    private AdminRepository() {
        adminSet = new HashSet<Admin>();
    }

    public static AdminRepository getRepository(){
        if(repository==(null)){
            repository = new AdminRepository();
        }
        return repository;
    }

    @Override
    public Set getSetAdmins() {
        return adminSet;
    }


    @Override
    public Admin create(Admin a) {
        boolean success = adminSet.add(a);
        if(!success)
            return null;
        return a;
    }

    @Override
    public Admin update(Admin c) {
        Admin oldAdmin = read(c.getAdminID());
        if(oldAdmin != null) {
            adminSet.remove(oldAdmin);
            adminSet.add((c));
            return c;
        }
        return null;
    }

    @Override
    public Admin read(Integer key) {
        return adminSet.stream()
                .filter(n -> n.getAdminID() == key )
                .findAny().orElse(null);
    }

    @Override
    public boolean delete(Integer key) {
        Admin admin = read(key);
            if(admin==null){
                return false;
            }else {
                adminSet.remove(admin);
            }
        return true;
    }
}
