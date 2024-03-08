package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOTOGP")
public class MotoGp {
	@Id
	@Column(name = "id")
	 Long id;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRacername() {
		return racername;
	}
	
	public void setRacername(String racername) {
		this.racername = racername;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public Integer getBikenumber() {
		return bikenumber;
	}
	
	public void setBikenumber(Integer bikenumber) {
		this.bikenumber = bikenumber;
	}
	
	public String getBikebrand() {
		return bikebrand;
	}
	
	public void setBikebrand(String bikebrand) {
		this.bikebrand = bikebrand;
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
	
	public Integer getChampionships() {
		return championships;
	}
	
	public void setChampionships(Integer championships) {
		this.championships = championships;
	}
	
	public Boolean getActive() {
		return active;
	}
	
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	@Column(name = "biker_name")
	 String racername;
	
	@Column(name = "team")
	 String team;
	
	@Column(name = "nationality")
	 String nationality;
	
	@Column(name = "bike_number")
	 Integer bikenumber;
	
	@Column(name = "bike_brand")
	 String bikebrand;
	
	@Column(name = "wins")
	 Integer wins;
	
	@Column(name = "podiums")
	 Integer podiums;
	
	@Column(name = "championships")
	 Integer championships;
	
	@Column(name = "active")
	 Boolean active;
}
