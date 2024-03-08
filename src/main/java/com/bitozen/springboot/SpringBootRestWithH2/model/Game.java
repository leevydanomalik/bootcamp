package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CALLOFDUTY")
public class Game {
	@Id
	@Column(name = "id")
	 Long id;
	
	@Column(name = "title")
	 String title;
	
	@Column(name = "release_year")
	 Integer releaseYear;
	
	@Column(name = "platform")
	 String platform;
	
	@Column(name = "genre")
	 String genre;
	
	@Column(name = "setting")
	 String setting;
	
	@Column(name = "main_character")
	 String mainCharacter;
	
	@Column(name = "multiplayer")
	 Boolean multiplayer;
	
	@Column(name = "dlc_available")
	 Boolean dlcAvailable;
	
	@Column(name = "sales")
	 Long sales;
	
	@Column(name = "rating")
	 Double rating;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Integer getReleaseYear() {
		return releaseYear;
	}
	
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public String getPlatform() {
		return platform;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getSetting() {
		return setting;
	}
	
	public void setSetting(String setting) {
		this.setting = setting;
	}
	
	public String getMainCharacter() {
		return mainCharacter;
	}
	
	public void setMainCharacter(String mainCharacter) {
		this.mainCharacter = mainCharacter;
	}
	
	public Boolean getMultiplayer() {
		return multiplayer;
	}
	
	public void setMultiplayer(Boolean multiplayer) {
		this.multiplayer = multiplayer;
	}
	
	public Boolean getDlcAvailable() {
		return dlcAvailable;
	}
	
	public void setDlcAvailable(Boolean dlcAvailable) {
		this.dlcAvailable = dlcAvailable;
	}
	
	public Long getSales() {
		return sales;
	}
	
	public void setSales(Long sales) {
		this.sales = sales;
	}
	
	public Double getRating() {
		return rating;
	}
	
	public void setRating(Double rating) {
		this.rating = rating;
	}
}
