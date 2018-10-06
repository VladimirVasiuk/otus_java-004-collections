package org.edu.domain;

public class SavingAccount extends AbstractAccount {

    public SavingAccount(int id, double amount) {
        super(id, amount);
    }

    public double maximumAmountToWithdraw() {
        return getBalance();
    }
}
