package model;

import java.util.ArrayList;
import java.util.List;

public class EWalletsystem {
    private final String name = "EraaSoft E Wallet System";
    private List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }


}
