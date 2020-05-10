package com.example.bankweb.service.serivceImp;

import com.example.bankweb.domain.PrimaryAccount;
import com.example.bankweb.domain.SavingsAccount;
import com.example.bankweb.service.AccountService;

import java.security.Principal;

public class AccountServiceImp implements AccountService {
    @Override
    public PrimaryAccount createPrimaryAccount() {
        return null;
    }

    @Override
    public SavingsAccount createSavingsAccount() {
        return null;
    }

    @Override
    public void deposit(String accountType, double amount, Principal principal) {

    }

    @Override
    public void withdraw(String accountType, double amount, Principal principal) {

    }
}
