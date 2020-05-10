package com.example.bankweb.dao;

import com.example.bankweb.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {
    PrimaryAccount findByAccountNumber(int accountNumber);
}