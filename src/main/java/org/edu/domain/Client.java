package org.edu.domain;

import java.util.*;

public class Client {

    private String name;
    private Gender gender;
    private Set<Account> accounts = new HashSet<Account>();

    public Client(String name, Gender gender) {
        this(name, gender, new ArrayList<Account>());
    }

    public Client(String name, Gender gender, Collection<Account> accounts) {
        this.name = name;
        this.gender = gender;
        this.accounts.addAll(accounts);
    }

    public void addAccount(final Account account) {
        accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Set<Account> getAccounts() {
        return Collections.unmodifiableSet(accounts);
    }
}
