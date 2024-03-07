package com.bitozen.springboot.SpringBootRestWithH2;
import com.bitozen.springboot.SpringBootRestWithH2.model.Car;
import com.bitozen.springboot.SpringBootRestWithH2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class CarController {
	@Autowired
	private CarService carService;
	// Select, Insert, Delete, Update Operations for an Team
	
	@RequestMapping(value = "/car/{id}", method = RequestMethod.GET)
	Car getCar(@PathVariable Integer id){
		return  carService.findById(id).get();
	}
	
	@RequestMapping(value = "/car", method = RequestMethod.POST)
	String addCar(@RequestBody Car car){
		Car savedCar = carService.save(car);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/car", method = RequestMethod.PUT)
	Car updateCar(@RequestBody Car car){
		Car updatedCar = carService.save(car);
		return updatedCar;
	}
	
	@RequestMapping(value = "/car", method = RequestMethod.DELETE)
	Map<String, String> deleteCar(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Car> car = carService.findById(id);
		if(car.isPresent()) {
			carService.delete(car.get());
			status.put("Status", "Cars deleted successfully");
		}
		else {
			status.put("Status", "Car not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	List<Car> getAllCar(){
		return carService.findAll();
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	String addAllCars(@RequestBody List<Car> carList){
		carService.saveAll(carList);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.DELETE)
	String addAllCars(){
		carService.deleteAll();
		return "SUCCESS";
	}
}
