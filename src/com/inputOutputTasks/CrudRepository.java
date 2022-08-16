package com.inputOutputTasks;

import java.util.List;

public interface CrudRepository<T> {
    T save(T entity);

    List<T> findAll();

    T findById(int id);

    void deleteAll();

    void deleteById(int id);

    void delete(T entity);

    boolean existsById(int id);

    T update(T entity) throws IllegalArgumentException;
}
