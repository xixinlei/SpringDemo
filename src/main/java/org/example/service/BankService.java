package org.example.service;

import org.example.dao.Account;
import org.example.dao.AccountIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Time;
import java.util.Timer;

@Service
//事务注解
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ, timeout = 5,readOnly = false)
public class BankService {

    @Autowired
    private Account account;

    public void Transfer(int id, int id_taget, int amount) {
        System.out.println(account.selectAccountForId(id).toString());
        System.out.println(account.selectAccountForId(id_taget).toString());

        account.addBalance(id_taget, amount);
        account.reduceBalance(id, amount);


        System.out.println("-----------------------------------------");

        System.out.println(account.selectAccountForId(id).toString());
        System.out.println(account.selectAccountForId(id_taget).toString());
    }
}
