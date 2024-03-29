/**
 Author: Kurtney Jantjies (218138105)
 */
package za.ac.cput.carservicemanagementsystem.service;

import java.util.List;

public interface IService<T, X> {
    //Create a new record
    T create(T t);

    //Update a record by Id
    T update(T t, X x);

    //Read all records
    List<T> findAll();

    //Read a record by ID
    T findById(X x);

    //Delete a record by ID
    void delete(X x);
}
