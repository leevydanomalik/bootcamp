package com.bitozen.springboot.SpringBootRestWithH2.service;
import com.bitozen.springboot.SpringBootRestWithH2.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DriverService extends JpaRepository<Driver,Integer> {

}
