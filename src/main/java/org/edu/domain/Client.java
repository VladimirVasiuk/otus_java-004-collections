package org.edu.domain;

import java.util.*;

public class Client {

    private String name;
    private Gender gender;
    // TODO: private ??????<Account> accounts = new ?????<Account>();

    public Client(String name, Gender gender, Collection<Account> accounts) {
        this.name = name;
        this.gender = gender;
        // TODO: this.accounts.addAll(accounts);
    }

    // TODO: public void addAccount(final Account account)

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    // TODO: public ??????<Account> getAccounts()
}
