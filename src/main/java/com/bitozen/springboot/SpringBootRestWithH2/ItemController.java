package com.bitozen.springboot.SpringBootRestWithH2;

import com.bitozen.springboot.SpringBootRestWithH2.model.Item;
import com.bitozen.springboot.SpringBootRestWithH2.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class ItemController {
	@Autowired
	ItemService itemService;
	
	// Select, Insert, Delete, Update Operations for an Employee
	
	@RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
	Item getItem(@PathVariable Integer id){
		return  itemService.findById(id).get();
	}
	
	@RequestMapping(value = "/item", method = RequestMethod.POST)
	String addItem(@RequestBody Item item){
		Item savedItem = itemService.save(item);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/item", method = RequestMethod.PUT)
	Item updateItem(@RequestBody Item item){
		Item updatedItem = itemService.save(item);
		return updatedItem;
	}
	
	@RequestMapping(value = "/item", method = RequestMethod.DELETE)
	Map<String, String> deleteItem(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Item> item = itemService.findById(id);
		if(item.isPresent()) {
			itemService.delete(item.get());
			status.put("Status", "Item deleted successfully");
		}
		else {
			status.put("Status", "Item not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/items", method = RequestMethod.GET)
	List<Item> getAllItem(){
		return itemService.findAll();
	}
	
	@RequestMapping(value = "/items", method = RequestMethod.POST)
	String addAllItems(@RequestBody List<Item> itemList){
		itemService.saveAll(itemList);
		return "BERHASIL";
	}
	
	@RequestMapping(value = "/items", method = RequestMethod.DELETE)
	String addAllItems(){
		itemService.deleteAll();
		return "BERHASIL";
	}
}
