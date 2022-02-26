package com.company.business.concrete;

import com.company.business.abstracts.CarService;
import com.company.entities.concretes.Car;
import com.company.dataAccess.abstracts.CarDao;
import com.company.core.Log.abstracts.LogDao;

public class CarManager implements CarService {
    private CarDao carDao;
    private LogDao logDao;

    public CarManager(CarDao carDao, LogDao logDao) {
        this.carDao = carDao;
        this.logDao = logDao;
    }

    @Override
    public void add(Car car) {
        this.carDao.add(car);
        this.logDao.logged();
    }

    @Override
    public void update(Car car) {
        this.carDao.update(car);
        this.logDao.logged();
    }

    @Override
    public void delete(Car car) {
        this.carDao.delete(car);
        this.logDao.logged();
    }
}
