package com.jsp.car.charsy.registrtion.service;


import com.jsp.car.charsy.registrtion.dao.CarDao;
import com.jsp.car.charsy.registrtion.dto.Car;
import com.jsp.car.charsy.registrtion.dto.Charsy;
import com.jsp.car.charsy.registrtion.dto.Registration;

public class CarService {

	CarDao carDao = new CarDao();

	public Car insertCar(Car car, Charsy charsy, Registration registration) {
		return carDao.insertCar(car, charsy, registration);
	}

	public Car deleteCar(Car car, Charsy charsy, Registration registration) {
		return carDao.deleteCar(car, charsy, registration);
	}

	public Car updateCar(Car car, Charsy charsy, Registration registration) {
		return carDao.updateCar(car, charsy, registration);
	}

	public void getAllDetails() {
		carDao.getAllDetails();
	}
}
