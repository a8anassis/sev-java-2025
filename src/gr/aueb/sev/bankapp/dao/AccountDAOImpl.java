package gr.aueb.sev.bankapp.dao;

import gr.aueb.sev.bankapp.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {
    private final List<Account> accounts = new ArrayList<>();

    @Override
    public void saveOrUpdate(Account account) {
        int position = accounts.indexOf(account);

        if (position == -1) {
            accounts.add(account);
            return;
        }
        accounts.set(position, account);
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
        return new ArrayList<>(accounts);
    }

    @Override
    public boolean isAccountExists(String iban) {
        return accounts.stream()
                .anyMatch(account -> account.getIban().equals(iban));
    }
}
