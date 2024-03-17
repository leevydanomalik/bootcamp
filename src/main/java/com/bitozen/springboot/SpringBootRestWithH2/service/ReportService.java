package com.bitozen.springboot.SpringBootRestWithH2.service;

import com.bitozen.springboot.SpringBootRestWithH2.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportService extends JpaRepository<Report,Integer> {

}
