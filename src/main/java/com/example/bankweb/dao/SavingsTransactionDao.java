package com.example.bankweb.dao;

import com.example.bankweb.domain.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction,Long> {
    List<SavingsTransaction> findAll();
}
