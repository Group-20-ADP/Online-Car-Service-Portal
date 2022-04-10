/**
 Author: Kurtney Clyde Jantjies (218138105)
 Group use
 */
package za.ac.cput.repository;

public interface IRepository<T, KEY> {
    T create(T t);
    T update(T t);
    T read(KEY key);
    boolean delete(KEY key);
}
