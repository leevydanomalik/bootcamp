package com.bitozen.springboot.SpringBootRestWithH2.service;

import com.bitozen.springboot.SpringBootRestWithH2.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryService extends JpaRepository<Inventory,Integer> {

}
