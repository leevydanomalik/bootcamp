package com.bitozen.springboot.SpringBootRestWithH2.model;

import io.swagger.models.auth.In;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "Transaction")
public class Transaction {
	@Column(name = "id")
	@javax.persistence.Id
	@Min(value = 0, message = "ID should not be less than 0")
	@Max(value = 65, message = "ID should not be greater than 65")
	Integer id;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column (name = "Customerid")
	Integer customerId;
	
	public Integer getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	@Column(name = "price")
	Double price;
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	@Column(name = "productid")
	Integer productid;
	
	public Integer getProductid() {
		return productid;
	}
	
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
}
