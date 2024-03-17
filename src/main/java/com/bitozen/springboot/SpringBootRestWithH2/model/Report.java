package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "REPORT")
public class Report {
	@Column(name = "id")
	@Id
	@Min(value = 0, message = "ID should not be less than 0")
	@Max(value = 65, message = "ID should not be greater than 65")
	Integer id;
	
	@Column(name = "staff_id")
	Integer staffID;
	@Column(name = "report_date")
	Integer reportDate;
	@Column(name = "details")
	String details;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getStaffID() {
		return staffID;
	}
	
	public void setStaffID(Integer staffID) {
		this.staffID = staffID;
	}
	
	public Integer getReportDate() {
		return reportDate;
	}
	
	public void setReportDate(Integer reportDate) {
		this.reportDate = reportDate;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
}
