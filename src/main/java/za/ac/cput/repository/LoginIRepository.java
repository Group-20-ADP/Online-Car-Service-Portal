package za.ac.cput.repository;

import za.ac.cput.Entity.Login;

import java.util.Set;

public interface LoginIRepository extends IRepository<Login, String>{
    public Set<Login> getall();
}
