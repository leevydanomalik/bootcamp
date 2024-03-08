package com.bitozen.springboot.SpringBootRestWithH2;
import com.bitozen.springboot.SpringBootRestWithH2.model.MotoGp;
import com.bitozen.springboot.SpringBootRestWithH2.service.MotogpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class MotogpController{
	@Autowired
	private MotogpService motogpService;
	// Select, Insert, Delete, Update Operations for an Employee
	
	@RequestMapping(value = "/motogp/{id}", method = RequestMethod.GET)
	MotoGp getMotogp(@PathVariable Integer id){
		return  motogpService.findById(id).get();
	}
	
	@RequestMapping(value = "/motogp", method = RequestMethod.POST)
	String addMotogp(@RequestBody MotoGp motoGp){
		MotoGp savedMotogp = motogpService.save(motoGp);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/motogp", method = RequestMethod.PUT)
	MotoGp updateMotogp(@RequestBody MotoGp motoGp){
		MotoGp updatedMotogp = motogpService.save(motoGp);
		return updatedMotogp;
	}
	
	@RequestMapping(value = "/motogp", method = RequestMethod.DELETE)
	Map<String, String> deleteMotogp(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<MotoGp> motoGp = motogpService.findById(id);
		if(motoGp.isPresent()) {
			motogpService.delete(motoGp.get());
			status.put("Status", "Team deleted successfully");
		}
		else {
			status.put("Status", "Team not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/motogps", method = RequestMethod.GET)
	List<MotoGp> getAllMotogp(){
		return motogpService.findAll();
	}
	
	@RequestMapping(value = "/motogps", method = RequestMethod.POST)
	String addAllMotogp(@RequestBody List<MotoGp> MotogpList){
		motogpService.saveAll(MotogpList);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/motogps", method = RequestMethod.DELETE)
	String addAllMotogps(){
		motogpService.deleteAll();
		return "BOUNJOUR!";
	}
}
