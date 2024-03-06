package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table (name = "PRODUCT")
public class Product {
	@Column(name = "id")
	@javax.persistence.Id
	@Min(value = 0, message = "ID should not be less than 0")
	@Max(value = 65, message = "ID should not be greater than 65")
	Integer Id;
	
	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		Id = id;
	}
	
	@Column (name = "productname")
	String productName;
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Column(name = "productprice")
	Double productPrice;
	
	public Double getProductPrice() {
		return productPrice;
	}
	
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
}
