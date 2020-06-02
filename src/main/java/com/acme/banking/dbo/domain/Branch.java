package com.acme.banking.dbo.domain;

import java.util.Collection;

import static java.util.Collections.unmodifiableCollection;

public class Branch {
    private Collection<Account> accounts; //TODO impl
    private String name;


    public Branch(String name, Collection<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public Collection<Account> getAccounts() {
        return unmodifiableCollection(accounts);
    }

    public Collection<Branch> getChildren() {
        //TODO
        return null;
    }

    public Collection<Client> getClients() {
        return null;
    }

    public String getName() {
        return name;
    }
}
