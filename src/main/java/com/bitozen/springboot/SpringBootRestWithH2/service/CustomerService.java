package com.bitozen.springboot.SpringBootRestWithH2.service;

import com.bitozen.springboot.SpringBootRestWithH2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerService extends JpaRepository<Customer, Integer>{
}
