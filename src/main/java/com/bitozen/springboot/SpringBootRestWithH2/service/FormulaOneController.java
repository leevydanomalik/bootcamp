package com.bitozen.springboot.SpringBootRestWithH2.service;
import com.bitozen.springboot.SpringBootRestWithH2.model.formulaOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
public class FormulaOneController {
	@Autowired
	private FormulaOneService formulaOneService;
	
	@RequestMapping(value = "/formulaOne/{id}", method = RequestMethod.GET)
	formulaOne getformulaOneTeam(@PathVariable Integer id){
		return  formulaOneService.findById(id).get();
	}
	
	@RequestMapping(value = "/formulaOne", method = RequestMethod.POST)
	String addformulaOneTeam(@RequestBody formulaOne formulaOne){
		formulaOne savedformulaOne = formulaOneService.save(formulaOne);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/formulaOne", method = RequestMethod.PUT)
	formulaOne updateformulaOneTeam(@RequestBody formulaOne formulaOne){
		formulaOne updatedformulaOne = formulaOneService.save(formulaOne);
		return updatedformulaOne;
	}
	
	@RequestMapping(value = "/formulaOne", method = RequestMethod.DELETE)
	Map<String, String> deleteformulaOneTeam(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<formulaOne> formulaOne = formulaOneService.findById(id);
		if(formulaOne.isPresent()) {
			formulaOneService.delete(formulaOne.get());
			status.put("Status", "Team deleted successfully");
		}
		else {
			status.put("Status", "Team is not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/formulaOne", method = RequestMethod.GET)
	List<formulaOne> getAllformulaOne(){
		return formulaOneService.findAll();
	}
	
	@RequestMapping(value = "/formulaOne", method = RequestMethod.POST)
	String addAllformulaOneTeams(@RequestBody List<formulaOne> formulaOneList){
		formulaOneService.saveAll(formulaOneList);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/formulaOne", method = RequestMethod.DELETE)
	String deleteAllTeams(){
		formulaOneService.deleteAll();
		return "SUCCESS";
	}
}
