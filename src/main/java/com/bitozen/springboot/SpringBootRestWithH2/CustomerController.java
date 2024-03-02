package com.bitozen.springboot.SpringBootRestWithH2;

import com.bitozen.springboot.SpringBootRestWithH2.model.Customer;
import com.bitozen.springboot.SpringBootRestWithH2.model.Employee;
import com.bitozen.springboot.SpringBootRestWithH2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Select, Insert, Delete, Update Operations for an Employee

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    Customer getCustomer(@PathVariable Integer id){
        return  customerService.findById(id).get();
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    String addCustomer(@RequestBody Customer customer){
        Customer savedCustomer = customerService.save(customer);
        return "SUCCESS";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.PUT)
    Customer updateCustomer(@RequestBody Customer customer){
        Customer updatedEmployee = customerService.save(customer);
        return updatedEmployee;
    }

    @RequestMapping(value = "/customer", method = RequestMethod.DELETE)
    Map<String, String> deleteCustomer(@RequestParam Integer id){
        Map<String, String> status = new HashMap<>();
        Optional<Customer> customer = customerService.findById(id);
        if(customer.isPresent()) {
            customerService.delete(customer.get());
            status.put("Status", "Employee deleted successfully");
        }
        else {
            status.put("Status", "Employee not exist");
        }
        return status;
    }

    // Select, Insert, Delete for List of Employees

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    List<Customer> getAllCustomer(){
        return customerService.findAll();
    }

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    String addAllCustomers(@RequestBody List<Customer> customerList){
        customerService.saveAll(customerList);
        return "SUCCESS";
    }

    @RequestMapping(value = "/customers", method = RequestMethod.DELETE)
    String addAllCustomers(){
        customerService.deleteAll();
        return "SUCCESS";
    }
}
