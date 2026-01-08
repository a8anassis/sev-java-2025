package gr.aueb.sev.bankapp.dao;

import gr.aueb.sev.bankapp.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {
    private final List<Account> accounts = new ArrayList<>();

    @Override
    public Account saveOrUpdate(Account account) {
        int position = accounts.indexOf(account);       // override equals

        if (position == -1) {
            accounts.add(account);
            return account;
        }
        accounts.set(position, account);
        return accounts.get(position);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(account -> account.getIban().equals(iban));
    }

    @Override
    public Optional<Account> getByIban(String iban) {
        return accounts.stream()
                .filter(account -> account.getIban().equals(iban))
                .findFirst();
    }

    @Override
    public List<Account> getAccounts() {
//        return accounts;
       //return new ArrayList<>(accounts);
        return List.copyOf(accounts);   // structurally unmodifiable
    }

    @Override
    public boolean isAccountExists(String iban) {
        return accounts.stream()
                .anyMatch(account -> account.getIban().equals(iban));
    }

    @Override
    public int count() {
        return accounts.size();
    }
}
