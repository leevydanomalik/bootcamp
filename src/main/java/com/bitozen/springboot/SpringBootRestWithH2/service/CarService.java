package com.bitozen.springboot.SpringBootRestWithH2.service;

import com.bitozen.springboot.SpringBootRestWithH2.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarService extends JpaRepository <Car,Integer> {

}
