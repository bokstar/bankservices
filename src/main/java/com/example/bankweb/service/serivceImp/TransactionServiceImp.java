package com.example.bankweb.service.serivceImp;

import com.example.bankweb.domain.*;
import com.example.bankweb.service.TransactionService;

import java.security.Principal;
import java.util.List;

public class TransactionServiceImp implements TransactionService {
    @Override
    public List<PrimaryTransaction> findPrimaryTransactionList(String username) {
        return null;
    }

    @Override
    public List<SavingsTransaction> findSavingsTransactionList(String username) {
        return null;
    }

    @Override
    public void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction) {

    }

    @Override
    public void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction) {

    }

    @Override
    public void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction) {

    }

    @Override
    public void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction) {

    }

    @Override
    public void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception {

    }

    @Override
    public List<Recipient> findRecipientList(Principal principal) {
        return null;
    }

    @Override
    public Recipient saveRecipient(Recipient recipient) {
        return null;
    }

    @Override
    public Recipient findRecipientByName(String recipientName) {
        return null;
    }

    @Override
    public void deleteRecipientByName(String recipientName) {

    }

    @Override
    public void toSomeoneElseTransfer(Recipient recipient, String accountType, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount) {

    }
}
