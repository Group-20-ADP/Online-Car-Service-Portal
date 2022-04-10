package za.ac.cput.repository;

import za.ac.cput.Entity.Admin;

import java.util.List;
import java.util.Set;

public interface AdminIRepository extends IRepository<Admin, Integer>{
    public Set<Admin> getSetAdmins();
}
