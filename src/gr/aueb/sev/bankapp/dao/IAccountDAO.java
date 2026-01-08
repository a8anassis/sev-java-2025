package gr.aueb.sev.bankapp.dao;

import gr.aueb.sev.bankapp.model.Account;

import java.util.List;
import java.util.Optional;

public interface IAccountDAO {
    Account saveOrUpdate(Account account);
    void remove(String iban);
    Optional<Account> getByIban(String iban);
    List<Account> getAccounts();
    int count();

    // Queries
    boolean isAccountExists(String iban);
}
