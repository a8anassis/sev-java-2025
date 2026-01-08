package gr.aueb.sev.bankapp.service;

import gr.aueb.sev.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.sev.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.sev.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.sev.bankapp.dto.AccountDepositDTO;
import gr.aueb.sev.bankapp.dto.AccountInsertDTO;
import gr.aueb.sev.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.sev.bankapp.dto.AccountWithdrawDTO;

import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {
    AccountReadOnlyDTO createNewAccount(AccountInsertDTO accountInsertDTO);
    void deposit(AccountDepositDTO depositDTO)
        throws AccountNotFoundException;
    void withdraw(AccountWithdrawDTO withdrawDTO)
            throws AccountNotFoundException, InsufficientBalanceException;
    BigDecimal getBalance(String iban) throws AccountNotFoundException;
    List<AccountReadOnlyDTO> getAllAccounts();
    int getCount();
    boolean isAccountExists(String iban);

    // queries
}
