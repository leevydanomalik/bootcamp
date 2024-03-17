package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "ITEM")
public class Item {
	@Column(name = "id")
	@Id
	@Min(value = 0, message = "ID should not be less than 0")
	@Max(value = 65, message = "ID should not be greater than 65")
	Integer id;
	
	@Column(name = "order_id")
	Integer orderID;
	@Column(name = "jenispakaian")
	String jenisPakaian;
	@Column(name = "price")
	Double price;
	@Column(name = "quantity")
	Integer quantity;
	
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
	
	public String getJenisPakaian() {
		return jenisPakaian;
	}
	
	public void setJenisPakaian(String jenisPakaian) {
		this.jenisPakaian = jenisPakaian;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
