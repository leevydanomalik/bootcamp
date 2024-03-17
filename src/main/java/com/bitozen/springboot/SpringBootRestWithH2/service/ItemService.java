package com.bitozen.springboot.SpringBootRestWithH2.service;

import com.bitozen.springboot.SpringBootRestWithH2.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemService extends JpaRepository<Item,Integer> {

}
