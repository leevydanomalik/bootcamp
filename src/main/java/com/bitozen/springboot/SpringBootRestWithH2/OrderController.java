package com.bitozen.springboot.SpringBootRestWithH2;

import com.bitozen.springboot.SpringBootRestWithH2.model.Order;
import com.bitozen.springboot.SpringBootRestWithH2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;
	
	// Select, Insert, Delete, Update Operations for an Employee
	
	@RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
	Order getOrder(@PathVariable Integer id){
		return  orderService.findById(id).get();
	}
	
	@RequestMapping(value = "/order", method = RequestMethod.POST)
	String addOrder(@RequestBody Order order){
		Order savedOrder = orderService.save(order);
		return "BERHASIL";
	}
	
	@RequestMapping(value = "/order", method = RequestMethod.PUT)
	Order updateOrder(@RequestBody Order order){
		Order updatedOrder = orderService.save(order);
		return updatedOrder;
	}
	
	@RequestMapping(value = "/order", method = RequestMethod.DELETE)
	Map<String, String> deleteOrder(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Order> order = orderService.findById(id);
		if(order.isPresent()) {
			orderService.delete(order.get());
			status.put("Status", "Order deleted successfully");
		}
		else {
			status.put("Status", "Order not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	List<Order> getAllOrder(){
		return orderService.findAll();
	}
	
	@RequestMapping(value = "/orders", method = RequestMethod.POST)
	String addAllOrders(@RequestBody List<Order> orderList){
		orderService.saveAll(orderList);
		return "BERHASIL";
	}
	
	@RequestMapping(value = "/orders", method = RequestMethod.DELETE)
	String addAllOrders(){
		orderService.deleteAll();
		return "BERHASIL";
	}
}
