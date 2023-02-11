package com.jsp.car.charsy.registrtion.controller;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jsp.car.charsy.registrtion.dto.Car;
import com.jsp.car.charsy.registrtion.dto.Charsy;
import com.jsp.car.charsy.registrtion.dto.Registration;
import com.jsp.car.charsy.registrtion.service.CarService;

public class TestDriver {
	public static void main(String[] args) {

		 //insert record
		Charsy charsy=new Charsy();
		charsy.setNumber("ABC");
		
		Registration registration=new Registration();
		registration.setNumber(1234567);
		
		Car car=new Car();
		car.setBrand("TYOTO");
		car.setName("FORTUNER");
		
		car.setRegistration(registration);
		car.setCharsy(charsy);
		
		CarService carService=new CarService();
		carService.insertCar(car, charsy, registration);

//		//DELETE RECORD
//		Charsy charsy2=new Charsy();
//		charsy2.setId(1);
//		
//		Registration registration2=new Registration();
//	    registration2.setId(1);
//	    
//	    Car car2=new Car();
//	    car2.setId(1);
//	    
//	    CarService carService=new CarService();
//	    carService.deleteCar(car2, charsy2, registration2);

		// update record
//		Charsy charsy3 = new Charsy();
//		Registration registration3 = new Registration();
//
//		Car car3 = new Car();
//		car3.setId(2);
//		car3.setBrand("tata");
//		car3.setName("tiago");
//
//		CarService carService = new CarService();
//		carService.updateCar(car3, charsy3, registration3);
//		

	// ToGetAll

	    CarService carService4 = new CarService();
		carService4.getAllDetails();

	}

}
