package com.bitozen.springboot.SpringBootRestWithH2.service;

import com.bitozen.springboot.SpringBootRestWithH2.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderService extends JpaRepository<Order,Integer> {

}
