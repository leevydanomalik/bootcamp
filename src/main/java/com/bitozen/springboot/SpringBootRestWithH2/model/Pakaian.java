package com.bitozen.springboot.SpringBootRestWithH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "PAKAIAN")
public class Pakaian {
	@Column(name = "id")
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
	
	public String getJenisPakaian() {
		return JenisPakaian;
	}
	
	public void setJenisPakaian(String jenisPakaian) {
		JenisPakaian = jenisPakaian;
	}
	
	public Integer getBeratPakaian() {
		return BeratPakaian;
	}
	
	public void setBeratPakaian(Integer beratPakaian) {
		BeratPakaian = beratPakaian;
	}
	
	public String getStatus() {
		return Status;
	}
	
	public void setStatus(String status) {
		Status = status;
	}
	
	public Float getHargaPerKG() {
		return HargaPerKG;
	}
	
	public void setHargaPerKG(Float hargaPerKG) {
		HargaPerKG = hargaPerKG;
	}
	
	@Column(name = "Jenis")
	String JenisPakaian;
	@Column(name = "Berat")
	Integer BeratPakaian;
	@Column(name = "Status")
	String Status;
	@Column(name = "Harga")
	Float HargaPerKG;
}
