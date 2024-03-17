package com.bitozen.springboot.SpringBootRestWithH2;

import com.bitozen.springboot.SpringBootRestWithH2.model.Staff;
import com.bitozen.springboot.SpringBootRestWithH2.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class StaffController {
	@Autowired
	StaffService staffService;
	// Select, Insert, Delete, Update Operations for an Employee
	
	@RequestMapping(value = "/staff/{id}", method = RequestMethod.GET)
	Staff getStaff(@PathVariable Integer id){
		return  staffService.findById(id).get();
	}
	
	@RequestMapping(value = "/staff", method = RequestMethod.POST)
	String addStaff(@RequestBody Staff staff){
		Staff savedStaff = staffService.save(staff);
		return "BERHASIL";
	}
	
	@RequestMapping(value = "/staff", method = RequestMethod.PUT)
	Staff updateStaff(@RequestBody Staff staff){
		Staff updatedStaff = staffService.save(staff);
		return updatedStaff;
	}
	
	@RequestMapping(value = "/staff", method = RequestMethod.DELETE)
	Map<String, String> deleteStaff(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Staff> staff = staffService.findById(id);
		if(staff.isPresent()) {
			staffService.delete(staff.get());
			status.put("Status", "Staff deleted successfully");
		}
		else {
			status.put("Status", "Staff not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/staffs", method = RequestMethod.GET)
	List<Staff> getAllStaff(){
		return staffService.findAll();
	}
	
	@RequestMapping(value = "/staffs", method = RequestMethod.POST)
	String addAllStafs(@RequestBody List<Staff> staffList){
		staffService.saveAll(staffList);
		return "BERHASIL";
	}
	
	@RequestMapping(value = "/staffs", method = RequestMethod.DELETE)
	String addAllStaffs(){
		staffService.deleteAll();
		return "BERHASIL";
	}
}
