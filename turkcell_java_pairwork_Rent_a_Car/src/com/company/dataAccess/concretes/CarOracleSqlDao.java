package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.CarDao;
import com.company.entities.concretes.Car;

public class CarOracleSqlDao implements CarDao {
    @Override
    public void add(Car car) {
        System.out.println("Car Added to OracleSql.");
    }

    @Override
    public void update(Car car) {
        System.out.println("Car Updated at OracleSql.");
    }

    @Override
    public void delete(Car car) {
        System.out.println("Car Deleted from OracleSql.");
    }
}
