package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
	@Column(name = "id")
	@Id
	@Min(value = 0, message = "ID should not be less than 0")
	@Max(value = 65, message = "ID should not be greater than 65")
	Integer id;
	@Column(name = "name")
	String name;
	@Column(name = "address")
	String address;
	@Column(name = "custtype")
	String custType;
	@Column(name = "custstatus")
	String custStatus;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCustType() {
		return custType;
	}
	
	public void setCustType(String custType) {
		this.custType = custType;
	}
	
	public String getCustStatus() {
		return custStatus;
	}
	
	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}
}
