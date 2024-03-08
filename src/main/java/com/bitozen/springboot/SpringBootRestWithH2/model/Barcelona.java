package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BARCELONA")
public class Barcelona {
	@Id
	@Column(name = "id")
	 Long id;
	
	@Column(name = "player_name")
	 String playerName;
	
	@Column(name = "position")
	 String position;
	
	@Column(name = "nationality")
	 String nationality;
	
	@Column(name = "age")
	 Integer age;
	
	@Column(name = "appearances")
	 Integer appearances;
	
	@Column(name = "goals")
	 Integer goals;
	
	@Column(name = "assists")
	 Integer assists;
	
	@Column(name = "yellow_cards")
	 Integer yellowCards;
	
	@Column(name = "red_cards")
	 Integer redCards;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getAppearances() {
		return appearances;
	}
	
	public void setAppearances(Integer appearances) {
		this.appearances = appearances;
	}
	
	public Integer getGoals() {
		return goals;
	}
	
	public void setGoals(Integer goals) {
		this.goals = goals;
	}
	
	public Integer getAssists() {
		return assists;
	}
	
	public void setAssists(Integer assists) {
		this.assists = assists;
	}
	
	public Integer getYellowCards() {
		return yellowCards;
	}
	
	public void setYellowCards(Integer yellowCards) {
		this.yellowCards = yellowCards;
	}
	
	public Integer getRedCards() {
		return redCards;
	}
	
	public void setRedCards(Integer redCards) {
		this.redCards = redCards;
	}
}
