/**
 Author: Kurtney Clyde Jantjies (218138105)
 */
package za.ac.cput.repository;

import za.ac.cput.Entity.User;

import java.util.Set;

public interface UserIRepository extends IRepository<User, Integer>{
    public Set<User> getAll();
}
