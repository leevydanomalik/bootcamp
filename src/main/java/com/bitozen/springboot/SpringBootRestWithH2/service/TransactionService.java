package com.bitozen.springboot.SpringBootRestWithH2.service;

import com.bitozen.springboot.SpringBootRestWithH2.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionService extends JpaRepository<Transaction,Integer> {

}
