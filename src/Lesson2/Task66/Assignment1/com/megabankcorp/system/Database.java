package Lesson2.Task66.Assignment1.com.megabankcorp.system;

import Lesson2.Task66.Assignment1.com.megabankcorp.records.Account;

import java.math.BigDecimal;

public abstract class Database {

    public abstract void deposit(BigDecimal sum, Account account);

    public abstract void withdraw(BigDecimal sum, Account account);

    protected abstract BigDecimal getAmount(Account account);

    void transfer(BigDecimal sum, Account fromAccount, Account toAccount) {
        withdraw(sum, fromAccount);
        deposit(sum, toAccount);
    }

}

