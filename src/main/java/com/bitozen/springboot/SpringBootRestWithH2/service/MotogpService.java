package com.bitozen.springboot.SpringBootRestWithH2.service;
import com.bitozen.springboot.SpringBootRestWithH2.model.MotoGp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotogpService extends JpaRepository<MotoGp,Integer> {

}
