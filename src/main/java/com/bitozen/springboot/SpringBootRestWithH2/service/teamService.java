package com.bitozen.springboot.SpringBootRestWithH2.service;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bitozen.springboot.SpringBootRestWithH2.model.Team;
public interface teamService extends JpaRepository<Team,Integer> {

}
