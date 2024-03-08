package com.bitozen.springboot.SpringBootRestWithH2.service;

import com.bitozen.springboot.SpringBootRestWithH2.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameService extends JpaRepository<Game,Integer> {

}
