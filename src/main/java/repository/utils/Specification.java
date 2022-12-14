package repository.utils;

public interface Specification<T> {
    boolean isExist(T t);
}
