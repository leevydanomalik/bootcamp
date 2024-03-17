package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "BILL")
public class Bill {
	@Column(name = "id")
	@Id
	@Min(value = 0, message = "ID should not be less than 0")
	@Max(value = 65, message = "ID should not be greater than 65")
	Integer id;
	
	@Column(name = "order_id")
	Integer orderID;
	@Column(name = "total_amount")
	Double totalAmount;
	@Column(name = "payment_status")
	Boolean paymentStatus;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getOrderID() {
		return orderID;
	}
	
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	
	public Double getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Boolean getPaymentStatus() {
		return paymentStatus;
	}
	
	public void setPaymentStatus(Boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
}
