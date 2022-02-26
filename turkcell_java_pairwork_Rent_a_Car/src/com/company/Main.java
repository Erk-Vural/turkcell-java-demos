package com.company;

import com.company.entities.concretes.Brand;
import com.company.entities.concretes.Car;
import com.company.entities.concretes.Color;
import com.company.dataAccess.concretes.CarMsSqlDao;
import com.company.core.Log.concretes.LogDbDao;
import com.company.business.concrete.CarManager;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Brand brand = new Brand(1,"brandName1");
        Color color = new Color(1, "colorName1");

        Car car = new Car(1,"carName1", brand,color);

        //System.out.println(car.getBrand().getName());

        CarManager carManager = new CarManager(new CarMsSqlDao(),new LogDbDao());
        carManager.add(car);
        carManager.update(car);
        carManager.delete(car);
    }
}
