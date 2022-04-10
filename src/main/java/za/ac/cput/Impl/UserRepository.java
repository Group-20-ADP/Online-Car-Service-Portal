/**
 Author: Kurtney Clyde Jantjies (218138105)
 */
package za.ac.cput.Impl;

import za.ac.cput.Entity.Admin;
import za.ac.cput.Entity.User;
import za.ac.cput.repository.UserIRepository;

import java.util.HashSet;
import java.util.Set;

public class UserRepository implements UserIRepository {
    private static UserRepository repository = null;
    private Set<User> users = null;

    private UserRepository() {
        users = new HashSet<User>();
    }

    public static UserRepository getRepository(){
        if(repository==(null)){
            repository = new UserRepository();
        }
        return repository;
    }

    @Override
    public User create(User user) {
        boolean success = users.add(user);
        if(!success)
            return null;
        return user;
    }

    @Override
    public User update(User user) {
        User oldUser = read(user.getUserID());
        if(oldUser != null) {
            users.remove(oldUser);
            users.add((user));
            return user;
        }
        return null;
    }

    @Override
    public User read(Integer key) {
        return users.stream()
                .filter(n -> n.getUserID() == key )
                .findAny().orElse(null);
    }

    @Override
    public boolean delete(Integer key) {
        User user = read(key);
        if(user==null){
            return false;
        }else {
            users.remove(user);
        }
        return true;
    }

    @Override
    public Set<User> getAll() {
        return users;
    }
}
