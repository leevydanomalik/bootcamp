package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "CARS")
public class Car {
	@Column(name = "id")
	@Id
	@Min(value = 1, message = "Team number should not be less than 1")
	@Max(value = 99, message = "ID should not be greater than 99")
	Integer id;
	@Column(name = "enginename")
	String enginename;
	
	@Column(name = "chassisname")
	String chassisname;
	
	@Column(name = "teamname")
	String teamname;
	
	@Column(name = "fuel")
	Float fuel;
	
	
	@Column(name = "frontwing")
	Float frontwing;
	
	@Column(name = "rearwing")
	Float rearwing;
	
	@Column(name = "onthrottle")
	Integer onthrottle;
	
	@Column(name = "offthrottle")
	Integer offthrottle;
	
	@Column(name = "frontchamber")
	Float frontcamber;
	
	@Column(name = "rearchamber")
	Float rearcamber;
	
	@Column(name = "fronttoeout")
	Float fronttoeout;
	
	@Column(name = "reartoein")
	Float reartoein;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getEnginename() {
		return enginename;
	}
	
	public void setEnginename(String enginename) {
		this.enginename = enginename;
	}
	
	public String getChassisname() {
		return chassisname;
	}
	
	public void setChassisname(String chassisname) {
		this.chassisname = chassisname;
	}
	
	public String getTeamname() {
		return teamname;
	}
	
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	
	public Float getFuel() {
		return fuel;
	}
	
	public void setFuel(Float fuel) {
		this.fuel = fuel;
	}
	
	public Float getFrontwing() {
		return frontwing;
	}
	
	public void setFrontwing(Float frontwing) {
		this.frontwing = frontwing;
	}
	
	public Float getRearwing() {
		return rearwing;
	}
	
	public void setRearwing(Float rearwing) {
		this.rearwing = rearwing;
	}
	
	public Integer getOnthrottle() {
		return onthrottle;
	}
	
	public void setOnthrottle(Integer onthrottle) {
		this.onthrottle = onthrottle;
	}
	
	public Integer getOffthrottle() {
		return offthrottle;
	}
	
	public void setOffthrottle(Integer offthrottle) {
		this.offthrottle = offthrottle;
	}
	
	public Float getFrontcamber() {
		return frontcamber;
	}
	
	public void setFrontcamber(Float frontcamber) {
		this.frontcamber = frontcamber;
	}
	
	public Float getRearcamber() {
		return rearcamber;
	}
	
	public void setRearcamber(Float rearcamber) {
		this.rearcamber = rearcamber;
	}
	
	public Float getFronttoeout() {
		return fronttoeout;
	}
	
	public void setFronttoeout(Float fronttoeout) {
		this.fronttoeout = fronttoeout;
	}
	
	public Float getReartoein() {
		return reartoein;
	}
	
	public void setReartoein(Float reartoein) {
		this.reartoein = reartoein;
	}
}
