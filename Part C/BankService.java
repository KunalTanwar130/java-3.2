package com.banking.service;

import com.banking.dao.AccountDao;
import com.banking.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BankService {

    @Autowired
    private AccountDao dao;

    public void transfer(int fromAcc, int toAcc, double amount) {
        Account sender = dao.getAccount(fromAcc);
        Account receiver = dao.getAccount(toAcc);

        if (sender.getBalance() >= amount) {
            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);

            dao.updateAccount(sender);
            dao.updateAccount(receiver);

            System.out.println("✅ Transaction Successful!");
        } else {
            throw new RuntimeException("❌ Insufficient balance!");
        }
    }
}
