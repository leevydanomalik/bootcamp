package com.bitozen.springboot.SpringBootRestWithH2.service;
import com.bitozen.springboot.SpringBootRestWithH2.model.Barcelona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarcelonaService extends JpaRepository<Barcelona,Integer> {

}
