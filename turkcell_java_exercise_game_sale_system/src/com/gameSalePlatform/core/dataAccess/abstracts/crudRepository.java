package com.gameSalePlatform.core.dataAccess.abstracts;

import com.gameSalePlatform.core.entities.Entity;

public interface crudRepository <T extends Entity> {
    void add(T entity);
    void update(T entity);
    void delete(T entity);
}
