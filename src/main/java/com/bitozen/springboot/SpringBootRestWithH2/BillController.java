package com.bitozen.springboot.SpringBootRestWithH2;

import com.bitozen.springboot.SpringBootRestWithH2.model.Bill;
import com.bitozen.springboot.SpringBootRestWithH2.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class BillController {
	@Autowired
	BillService billService;
	// Select, Insert, Delete, Update Operations for an Employee
	
	@RequestMapping(value = "/bill/{id}", method = RequestMethod.GET)
	Bill getBill(@PathVariable Integer id){
		return  billService.findById(id).get();
	}
	
	@RequestMapping(value = "/bill", method = RequestMethod.POST)
	String addBill(@RequestBody Bill bill){
		Bill savedBill = billService.save(bill);
		return "BERHASIL";
	}
	
	@RequestMapping(value = "/bill", method = RequestMethod.PUT)
	Bill updateBill(@RequestBody Bill bill){
		Bill updatedBill = billService.save(bill);
		return updatedBill;
	}
	
	@RequestMapping(value = "/bill", method = RequestMethod.DELETE)
	Map<String, String> deleteBill(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Bill> bill = billService.findById(id);
		if(bill.isPresent()) {
			billService.delete(bill.get());
			status.put("Status", "Bill deleted successfully");
		}
		else {
			status.put("Status", "Bill not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/bills", method = RequestMethod.GET)
	List<Bill> getAllBill(){
		return billService.findAll();
	}
	
	@RequestMapping(value = "/bills", method = RequestMethod.POST)
	String addAllBills(@RequestBody List<Bill> billList){
		billService.saveAll(billList);
		return "BERHASIL";
	}
	
	@RequestMapping(value = "/bills", method = RequestMethod.DELETE)
	String addAllBills(){
		billService.deleteAll();
		return "BERHASIL";
	}
}
