package repository;

import java.util.List;

public interface Storage<T> {
    List<T> getStorageList();
}
