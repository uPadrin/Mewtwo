package com.mewtow.cardProcessor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mewtow.cardProcessor.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
