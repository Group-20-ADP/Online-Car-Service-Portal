package za.ac.cput.repository;

import za.ac.cput.Entity.Authentication;

import java.util.Set;

public interface AuthIRepository extends IRepository<Authentication, String> {
    public Set<Authentication> getAll();
}
