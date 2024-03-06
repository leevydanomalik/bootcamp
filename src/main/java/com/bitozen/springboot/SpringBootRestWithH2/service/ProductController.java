package com.bitozen.springboot.SpringBootRestWithH2.service;

import com.bitozen.springboot.SpringBootRestWithH2.model.Employee;
import com.bitozen.springboot.SpringBootRestWithH2.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	// Select, Insert, Delete, Update Operations for an Employee
	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	Product getProduct(@PathVariable Integer id){
		return  productService.findById(id).get();
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	String addProduct(@RequestBody Product product){
		Product savedProduct = productService.save(product);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.PUT)
	Product updateProduct(@RequestBody Product product){
		Product updatedProduct = productService.save(product);
		return updatedProduct;
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.DELETE)
	Map<String, String> deleteProduct(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Product> product = productService.findById(id);
		if(product.isPresent()) {
			productService.delete(product.get());
			status.put("Status", "Product deleted successfully");
		}
		else {
			status.put("Status", "Product not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	List<Product> getAllProduct(){
		return productService.findAll();
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	String addAllProducts(@RequestBody List<Product> productList){
		productService.saveAll(productList);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.DELETE)
	String addAllProducts(){
		productService.deleteAll();
		return "SUCCESS";
	}
}
