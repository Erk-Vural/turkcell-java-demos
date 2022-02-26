package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.CarDao;
import com.company.entities.concretes.Car;

public class CarMsSqlDao implements CarDao {
    @Override
    public void add(Car car) {
        System.out.println("Car with brand: " + car.getBrand().getName() + " Added to MsSql.");
    }

    @Override
    public void update(Car car) {
        System.out.println("Car Updated at MsSql.");
    }

    @Override
    public void delete(Car car) {
        System.out.println("Car Deleted from MsSql.");
    }
}
