package gr.aueb.sev.bankapp.service;

import gr.aueb.sev.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.sev.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.sev.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.sev.bankapp.dto.AccountInsertDTO;
import gr.aueb.sev.bankapp.dto.AccountReadOnlyDTO;

import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {
    boolean createNewAccount(AccountInsertDTO accountInsertDTO);
    void deposit(String iban, BigDecimal amount)
        throws NegativeAmountException, AccountNotFoundException;
    void withdraw(String iban, BigDecimal amount)
            throws NegativeAmountException, AccountNotFoundException, InsufficientBalanceException;
    BigDecimal getBalance(String iban) throws AccountNotFoundException;
    List<AccountReadOnlyDTO> getAllAccounts();
    boolean isAccountExists(String iban);

    // queries
}
