package com.bitozen.springboot.SpringBootRestWithH2.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "BLINK")
public class Blink {
	@Column(name = "ID")
	@Id
	@Min(value = 0,message = "Could not less then 0")
	@Max(value = 65,message = "Could not greater then 65")
	Integer id;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "grade")
	Character grade;
	
	@Column(name = "activate")
	Boolean is_band_still_active;
	@Column(name = "member")
	String member;
	@Column(name = "rating")
	Float band_rating ;
	@Column(name = "personalrating")
	Double personal_rating;
	@Column(name = "datee")
	LocalDate current_date;
	@Column(name = "timee")
	LocalDateTime current_time;
	
	public LocalDateTime getCurrent_time() {
		return current_time;
	}
	
	public void setCurrent_time(LocalDateTime current_time) {
		this.current_time = current_time;
	}
	
	public LocalDate getCurrent_date() {
		return current_date;
	}
	
	public void setCurrent_date(LocalDate current_date) {
		this.current_date = current_date;
	}
	
	public Character getGrade() {
		return grade;
	}
	
	public void setGrade(Character grade) {
		this.grade = grade;
	}
	
	public Boolean getIs_band_still_active() {
		return is_band_still_active;
	}
	
	public void setIs_band_still_active(Boolean is_band_still_active) {
		this.is_band_still_active = is_band_still_active;
	}
	
	public String getMember() {
		return member;
	}
	
	public void setMember(String member) {
		this.member = member;
	}
	
	public Float getBand_rating() {
		return band_rating;
	}
	
	public void setBand_rating(Float band_rating) {
		this.band_rating = band_rating;
	}
	
	public Double getPersonal_rating() {
		return personal_rating;
	}
	
	public void setPersonal_rating(Double personal_rating) {
		this.personal_rating = personal_rating;
	}
}
