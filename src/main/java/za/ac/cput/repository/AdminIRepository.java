package za.ac.cput.repository;

import za.ac.cput.Entity.Admin;

import java.util.List;
import java.util.Set;

public interface AdminIRepository<T> extends IRepository{
    public List<T> getListAdmins();
    public Set<T> getSetAdmins();
}
