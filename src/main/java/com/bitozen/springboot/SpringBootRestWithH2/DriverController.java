package com.bitozen.springboot.SpringBootRestWithH2;
import com.bitozen.springboot.SpringBootRestWithH2.model.Driver;
import  com.bitozen.springboot.SpringBootRestWithH2.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class DriverController {
	@Autowired
	private DriverService driverService;
	
	// Select, Insert, Delete, Update Operations for an Employee
	
	@RequestMapping(value = "/driver/{id}", method = RequestMethod.GET)
	Driver getDriver(@PathVariable Integer id){
		return  driverService.findById(id).get();
	}
	
	@RequestMapping(value = "/driver", method = RequestMethod.POST)
	String addDriver(@RequestBody Driver driver){
		Driver savedDriver = driverService.save(driver);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/driver", method = RequestMethod.PUT)
	Driver updateDriver(@RequestBody Driver driver){
		Driver updatedDriver = driverService.save(driver);
		return updatedDriver;
	}
	
	@RequestMapping(value = "/driver", method = RequestMethod.DELETE)
	Map<String, String> deleteDriver(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Driver> driver = driverService.findById(id);
		if(driver.isPresent()) {
			driverService.delete(driver.get());
			status.put("Status", "Driver deleted successfully");
		}
		else {
			status.put("Status", "Driver not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/drivers", method = RequestMethod.GET)
	List<Driver> getAllDriver(){
		return driverService.findAll();
	}
	
	@RequestMapping(value = "/drivers", method = RequestMethod.POST)
	String addAllDrivers(@RequestBody List<Driver> driverList){
		driverService.saveAll(driverList);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/drivers", method = RequestMethod.DELETE)
	String addAllDrivers(){
		driverService.deleteAll();
		return "SUCCESS";
	}
}
