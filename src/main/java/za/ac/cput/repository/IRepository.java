package za.ac.cput.repository;

public interface IRepository<T, KEY> {
    T create(T t);
    T update(T t);
    T read(KEY key);
    T delete(T t);
}
