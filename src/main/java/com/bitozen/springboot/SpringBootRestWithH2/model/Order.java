package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "orderr")
public class Order {
	@Column(name = "id")
	@Id
	@Min(value = 0, message = "ID should not be less than 0")
	@Max(value = 65, message = "ID should not be greater than 65")
	Integer id;
	
	@Column(name = "customer_id")
	Integer customerID;
	@Column(name = "staff_id")
	Integer staffID;
	@Column(name = "order_date")
	Integer orderDate;
	@Column(name = "status")
	String status;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}
	
	public Integer getStaffID() {
		return staffID;
	}
	
	public void setStaffID(Integer staffID) {
		this.staffID = staffID;
	}
	
	public Integer getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(Integer orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
