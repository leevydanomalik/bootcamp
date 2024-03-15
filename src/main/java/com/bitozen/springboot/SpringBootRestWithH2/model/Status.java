package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "STATUS")
public class Status {
	@Column(name = "id")
	@Id
	@Min(value = 0,message = "Could not less then 0")
	@Max(value = 65,message = "Could not greater then 65")
	Integer id;
	
	@Column(name = "LaundryStatus")
	String LaundryStatus;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLaundryStatus() {
		return LaundryStatus;
	}
	
	public void setLaundryStatus(String laundryStatus) {
		LaundryStatus = laundryStatus;
	}
}
