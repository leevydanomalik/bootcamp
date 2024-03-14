package com.bitozen.springboot.SpringBootRestWithH2;

import com.bitozen.springboot.SpringBootRestWithH2.model.Blink;
import com.bitozen.springboot.SpringBootRestWithH2.service.BlinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class BlinkController {
	@Autowired
	private BlinkService blinkService;
	
	@RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
	Blink getBlink(@PathVariable Integer id){
		return  blinkService.findById(id).get();
	}
	
	@RequestMapping(value = "/blink", method = RequestMethod.POST)
	String addBlink(@RequestBody Blink blink){
		Blink savedBlink = blinkService.save(blink);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/blink", method = RequestMethod.PUT)
	Blink updateBlink(@RequestBody Blink blink){
		Blink updatedBlink = blinkService.save(blink);
		return updatedBlink;
	}
	
	@RequestMapping(value = "/blink", method = RequestMethod.DELETE)
	Map<String, String> deleteBlink(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Blink> blink = blinkService.findById(id);
		if(blink.isPresent()) {
			blinkService.delete(blink.get());
			status.put("Status", "Data deleted successfully");
		}
		else {
			status.put("Status", "Data not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/blinks", method = RequestMethod.GET)
	List<Blink> getAllBlink(){
		return blinkService.findAll();
	}
	
	@RequestMapping(value = "/blinks", method = RequestMethod.POST)
	String addAllBlinks(@RequestBody List<Blink> blinkList){
		blinkService.saveAll(blinkList);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/blinks", method = RequestMethod.DELETE)
	String deleteAllBlinks(){
		blinkService.deleteAll();
		return "SUCCESS";
	}
}
