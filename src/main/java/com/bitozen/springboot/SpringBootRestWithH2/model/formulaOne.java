package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "FORMULAONE")
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
	
	@Column(name = "team")
	@NotNull(message = "Team Name cannot be null")
	String teamname;
	
	public String getTeamname() {
		return teamname;
	}
	
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	
	@Column(name = "chassis")
	@NotNull(message = "This cannot be null")
	String chassisname;
	
	public String getChassisname() {
		return chassisname;
	}
	
	public void setChassisname(String chassisname) {
		this.chassisname = chassisname;
	}
}
