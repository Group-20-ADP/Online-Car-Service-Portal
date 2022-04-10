package za.ac.cput.repository;

import za.ac.cput.Entity.Role;

import java.util.Set;

public interface RoleIRepository extends IRepository<Role, Integer>{
    public Set<Role> getAllRoles();
}
