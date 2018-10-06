package org.edu.domain;

import org.edu.exceptions.NotEnoughFundsException;

public interface Account {

    public void deposit(double amount);

    public void withdraw(double amount) throws NotEnoughFundsException;

    public int getId();

    public double getBalance();

    public double maximumAmountToWithdraw();
}
