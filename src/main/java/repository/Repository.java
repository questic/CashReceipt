package repository;

import repository.utils.Specification;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();
    List<T> findBySpecification(Specification specification);
    void add(T t);
}
