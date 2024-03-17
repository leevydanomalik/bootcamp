package com.bitozen.springboot.SpringBootRestWithH2;

import com.bitozen.springboot.SpringBootRestWithH2.model.Report;
import com.bitozen.springboot.SpringBootRestWithH2.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class ReportController {
	@Autowired
	ReportService reportService;
	// Select, Insert, Delete, Update Operations for an Employee
	
	@RequestMapping(value = "/report/{id}", method = RequestMethod.GET)
	Report getReport(@PathVariable Integer id){
		return  reportService.findById(id).get();
	}
	
	@RequestMapping(value = "/report", method = RequestMethod.POST)
	String addReport(@RequestBody Report report){
		Report savedReport = reportService.save(report);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/report", method = RequestMethod.PUT)
	Report updateReport(@RequestBody Report report){
		Report updatedReport = reportService.save(report);
		return updatedReport;
	}
	
	@RequestMapping(value = "/report", method = RequestMethod.DELETE)
	Map<String, String> deleteReport(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Report> report = reportService.findById(id);
		if(report.isPresent()) {
			reportService.delete(report.get());
			status.put("Status", "Report deleted successfully");
		}
		else {
			status.put("Status", "Report not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/reports", method = RequestMethod.GET)
	List<Report> getAllReport(){
		return reportService.findAll();
	}
	
	@RequestMapping(value = "/reports", method = RequestMethod.POST)
	String addAllReports(@RequestBody List<Report> reportList){
		reportService.saveAll(reportList);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/reports", method = RequestMethod.DELETE)
	String addAllReports(){
		reportService.deleteAll();
		return "SUCCESS";
	}
}
