package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "DRIVER")
public class Driver {
	@Column(name = "id")
	@Id
	@Min(value = 0, message = "ID should not be less than 0")
	@Max(value = 65, message = "ID should not be greater than 65")
	Integer id;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	public String getTeamname() {
		return teamname;
	}
	
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	
	public Integer getCarnumber() {
		return carnumber;
	}
	
	public void setCarnumber(Integer carnumber) {
		this.carnumber = carnumber;
	}
	
	public Integer getChampionsip() {
		return championsip;
	}
	
	public void setChampionsip(Integer championsip) {
		this.championsip = championsip;
	}
	
	public Integer getWins() {
		return wins;
	}
	
	public void setWins(Integer wins) {
		this.wins = wins;
	}
	
	public Integer getPodiums() {
		return podiums;
	}
	
	public void setPodiums(Integer podiums) {
		this.podiums = podiums;
	}
	
	public Double getCareerpoints() {
		return careerpoints;
	}
	
	public void setCareerpoints(Double careerpoints) {
		this.careerpoints = careerpoints;
	}
	
	public Integer getPoleposition() {
		return poleposition;
	}
	
	public void setPoleposition(Integer poleposition) {
		this.poleposition = poleposition;
	}
	
	public Integer getFastestlap() {
		return fastestlap;
	}
	
	public void setFastestlap(Integer fastestlap) {
		this.fastestlap = fastestlap;
	}
	
	public String getEntry() {
		return entry;
	}
	
	public void setEntry(String entry) {
		this.entry = entry;
	}
	public String getLastentry() {
		return lastentry;
	}
	
	public void setLastentry(String lastentry) {
		this.lastentry = lastentry;
	}
	
	@Column(name = "firstname")
	String firstname;
	@Column(name = "lastname")
	String lastname;
	@Column(name = "nationality")
	Boolean nationality;
	
	public Boolean getNationality() {
		return nationality;
	}
	
	public void setNationality(Boolean nationality) {
		this.nationality = nationality;
	}
	
	@Column(name = "teamname")
	String teamname;
	@Column(name = "carnumber")
	Integer carnumber;
	@Column(name = "championsip")
	Integer championsip;
	@Column(name = "wins")
	Integer wins;
	@Column(name = "podiums")
	Integer podiums;
	@Column(name = "careerpoints")
	Double careerpoints;
	@Column(name = "poleposition")
	Integer poleposition;
	@Column(name = "fastestlap")
	Integer fastestlap;
	@Column(name = "firstentry")
	String entry;
	@Column(name = "firstwin")
	String firstwin;
	@Column(name = "driverlicense")
	Character driverlicense;
	
	public Character getDriverlicense() {
		return driverlicense;
	}
	
	public void setDriverlicense(Character driverlicense) {
		this.driverlicense = driverlicense;
	}
	
	public String getFirstwin() {
		return firstwin;
	}
	
	public void setFirstwin(String firstwin) {
		this.firstwin = firstwin;
	}
	
	@Column(name = "lastentry")
	String lastentry;
}
