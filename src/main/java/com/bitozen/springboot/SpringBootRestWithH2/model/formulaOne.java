package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Formula One Team")
public class formulaOne {
	
	@Column(name = "id")
	@Id
	@Min(value = 0, message = "Team should not be less than 0")
	@Max(value = 65, message = "Team should not be greater than 65")
	Integer id;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "Team Name")
	@NotNull(message = "Team Name cannot be null")
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "Chassis Name")
	@NotNull(message = "This cannot be null")
	String address;
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
