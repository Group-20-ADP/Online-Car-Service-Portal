/**
 Author: Kurtney Clyde Jantjies (218138105)
 */
package za.ac.cput.Impl;

import za.ac.cput.Entity.Admin;
import za.ac.cput.Entity.Role;
import za.ac.cput.repository.RoleIRepository;

import java.util.HashSet;
import java.util.Set;

public class RoleRepository implements RoleIRepository {
    private static RoleRepository repository = null;
    private Set<Role> roles = null;

    private RoleRepository() {
        roles = new HashSet<Role>();
    }

    public static RoleRepository getRepository(){
        if(repository==(null)){
            repository = new RoleRepository();
        }
        return repository;
    }

    @Override
    public Role create(Role role) {
        boolean success = roles.add(role);
        if(!success)
            return null;
        return role;
    }

    @Override
    public Role update(Role role) {
        Role oldRole = read(role.getRoleID());
        if(oldRole != null) {
            roles.remove(oldRole);
            roles.add((role));
            return role;
        }
        return null;
    }

    @Override
    public Role read(Integer key) {
        return roles.stream()
                .filter(n -> n.getRoleID() == key )
                .findAny().orElse(null);
    }

    @Override
    public boolean delete(Integer integer) {
        Role role = read(integer);
        if(role==null){
            return false;
        }else {
            roles.remove(role);
        }
        return true;
    }

    @Override
    public Set<Role> getAllRoles() {
        return roles;
    }
}
