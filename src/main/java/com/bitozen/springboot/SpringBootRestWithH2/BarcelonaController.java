package com.bitozen.springboot.SpringBootRestWithH2;

import com.bitozen.springboot.SpringBootRestWithH2.model.Barcelona;
import com.bitozen.springboot.SpringBootRestWithH2.model.MotoGp;
import com.bitozen.springboot.SpringBootRestWithH2.service.BarcelonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class BarcelonaController {
	@Autowired
	private BarcelonaService barcelonaService;
	// Select, Insert, Delete, Update Operations for an Employee
	
	@RequestMapping(value = "/barcelona/{id}", method = RequestMethod.GET)
	Barcelona getBarcelona(@PathVariable Integer id){
		return  barcelonaService.findById(id).get();
	}
	
	@RequestMapping(value = "/barcelona", method = RequestMethod.POST)
	String addBarcelona(@RequestBody Barcelona barcelona){
		Barcelona savedBarcelona = barcelonaService.save(barcelona);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/barcelona", method = RequestMethod.PUT)
	Barcelona updateBarcelona(@RequestBody Barcelona barcelona){
		Barcelona updatedBarcelona = barcelonaService.save(barcelona);
		return updatedBarcelona;
	}
	
	@RequestMapping(value = "/barcelona", method = RequestMethod.DELETE)
	Map<String, String> deleteBarcelona(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Barcelona> barcelona = barcelonaService.findById(id);
		if(barcelona.isPresent()) {
			barcelonaService.delete(barcelona.get());
			status.put("Status", "Data deleted successfully");
		}
		else {
			status.put("Status", "Data not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/barcelonas", method = RequestMethod.GET)
	List<Barcelona> getAllBarcelona(){
		return barcelonaService.findAll();
	}
	
	@RequestMapping(value = "/barcelonas", method = RequestMethod.POST)
	String addAllBarcelona(@RequestBody List<Barcelona> barcelonaList){
		barcelonaService.saveAll(barcelonaList);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/barcelonas", method = RequestMethod.DELETE)
	String addAllBarcelonas(){
		barcelonaService.deleteAll();
		return "SUCCESS";
	}
}
