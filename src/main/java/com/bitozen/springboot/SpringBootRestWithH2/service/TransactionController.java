package com.bitozen.springboot.SpringBootRestWithH2.service;

import com.bitozen.springboot.SpringBootRestWithH2.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class TransactionController {
	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(value = "/transaction/{id}", method = RequestMethod.GET)
	Transaction getTransaction(@PathVariable Integer id){
		return  transactionService.findById(id).get();
	}
	
	@RequestMapping(value = "/transaction", method = RequestMethod.POST)
	String addTransaction(@RequestBody Transaction transaction){
		Transaction savedTransaction = transactionService.save(transaction);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/transaction", method = RequestMethod.PUT)
	Transaction updateTransaction(@RequestBody Transaction transaction){
		Transaction updatedTransaction = transactionService.save(transaction);
		return updatedTransaction;
	}
	
	@RequestMapping(value = "/transaction", method = RequestMethod.DELETE)
	Map<String, String> deleteTransaction(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Transaction> transaction = transactionService.findById(id);
		if(transaction.isPresent()) {
			transactionService.delete(transaction.get());
			status.put("Status", "Transaction deleted successfully");
		}
		else {
			status.put("Status", "Transaction not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/transactions", method = RequestMethod.GET)
	List<Transaction> getAllTransactions(){
		return transactionService.findAll();
	}
	
	@RequestMapping(value = "/transactions", method = RequestMethod.POST)
	String addAllTransactions(@RequestBody List<Transaction> transactionList){
		transactionService.saveAll(transactionList);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/transactions", method = RequestMethod.DELETE)
	String deleteAlltransactions(){
		transactionService.deleteAll();
		return "SUCCESS";
	}
}
