package com.bitozen.springboot.SpringBootRestWithH2.service;
import com.bitozen.springboot.SpringBootRestWithH2.model.Blink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlinkService extends JpaRepository<Blink,Integer> {

}
