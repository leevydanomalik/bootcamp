package com.bitozen.springboot.SpringBootRestWithH2;

import com.bitozen.springboot.SpringBootRestWithH2.model.Inventory;
import com.bitozen.springboot.SpringBootRestWithH2.model.Order;
import com.bitozen.springboot.SpringBootRestWithH2.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class InventoryController {
	@Autowired
	InventoryService inventoryService;
	// Select, Insert, Delete, Update Operations for an Employee
	
	@RequestMapping(value = "/inventory/{id}", method = RequestMethod.GET)
	Inventory getInventory(@PathVariable Integer id){
		return  inventoryService.findById(id).get();
	}
	
	@RequestMapping(value = "/inventory", method = RequestMethod.POST)
	String addInventory(@RequestBody Inventory inventory){
		Inventory savedInventory = inventoryService.save(inventory);
		return "BERHASIL";
	}
	
	@RequestMapping(value = "/inventory", method = RequestMethod.PUT)
	Inventory updateInventory(@RequestBody Inventory inventory){
		Inventory updatedInventory = inventoryService.save(inventory);
		return updatedInventory;
	}
	
	@RequestMapping(value = "/inventory", method = RequestMethod.DELETE)
	Map<String, String> deleteInventory(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Inventory> inventory = inventoryService.findById(id);
		if(inventory.isPresent()) {
			inventoryService.delete(inventory.get());
			status.put("Status", "Inventory deleted successfully");
		}
		else {
			status.put("Status", "Inventory not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/inventorys", method = RequestMethod.GET)
	List<Inventory> getAllInventory(){
		return inventoryService.findAll();
	}
	
	@RequestMapping(value = "/inventorys", method = RequestMethod.POST)
	String addAllInventorys(@RequestBody List<Inventory> inventoryList){
		inventoryService.saveAll(inventoryList);
		return "BERHASIL";
	}
	
	@RequestMapping(value = "/inventorys", method = RequestMethod.DELETE)
	String addAllInventorys(){
		inventoryService.deleteAll();
		return "BERHASIL";
	}
}
