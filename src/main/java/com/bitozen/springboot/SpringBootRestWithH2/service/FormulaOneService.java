package com.bitozen.springboot.SpringBootRestWithH2.service;
import com.bitozen.springboot.SpringBootRestWithH2.model.formulaOne;
import org.springframework.data.jpa.repository.JpaRepository;
public interface  FormulaOneService extends JpaRepository<formulaOne,Integer> {

}
