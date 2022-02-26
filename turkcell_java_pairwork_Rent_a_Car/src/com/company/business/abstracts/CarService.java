package com.company.business.abstracts;

import com.company.entities.concretes.Car;

public interface CarService {
    void add(Car car);
    void update(Car car);
    void delete(Car car);
}
