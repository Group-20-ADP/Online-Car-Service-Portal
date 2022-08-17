package za.ac.cput.Impl;

import za.ac.cput.Entity.Login;
import za.ac.cput.repository.LoginIRepository;

import java.util.HashSet;
import java.util.Set;

public class LoginRepository implements LoginIRepository {
    private static LoginIRepository repository = null;
    private Set<Login> LogDB = null;

    private LoginRepository(){
        LogDB = new HashSet<Login>();
    }

    public static LoginIRepository getRepository(){
        if(repository == null){
            repository = new LoginRepository();
        }
        return repository;
    }



    public Login creat(Login log) {
        boolean login = LogDB.add(log);
        if(!login)
            return null;
        return log;


    }

    @Override
    public Login read(String userName) {
        for(Login l:LogDB){
            if(l.getUserName().equals(userName));
            return l;
        }
        return null;

    }

    @Override
    public Login create(Login login) {
        return null;
    }

    @Override
    public  Login update(Login log) {
        Login oldLogin = read(log.getUserName());
        if(oldLogin != null){
            LogDB.remove(oldLogin);
            LogDB.add(log);
            return log;
        }
        return null;

    }

    @Override
    public boolean delete(String userName) {
        Login deleteLogin = read(userName);
        if(deleteLogin == null) {
            return false;
        }
        LogDB.remove(deleteLogin);
        return true;

    }
    @Override
    public Set<Login> getall() {
        return LogDB;
    }
}
