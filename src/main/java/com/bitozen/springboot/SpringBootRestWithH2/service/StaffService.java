package com.bitozen.springboot.SpringBootRestWithH2.service;

import com.bitozen.springboot.SpringBootRestWithH2.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffService extends JpaRepository<Staff,Integer> {

}
