package gr.aueb.sev.bankapp.service;

import gr.aueb.sev.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.sev.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.sev.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.sev.bankapp.core.mapper.Mapper;
import gr.aueb.sev.bankapp.dao.IAccountDAO;
import gr.aueb.sev.bankapp.dto.AccountInsertDTO;
import gr.aueb.sev.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.sev.bankapp.model.Account;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class AccountServiceImpl implements IAccountService {
    private final IAccountDAO accountDAO;

    public AccountServiceImpl(IAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public boolean createNewAccount(AccountInsertDTO accountInsertDTO) {
        Account account = Mapper.mapToModelEntity(accountInsertDTO);
        accountDAO.saveOrUpdate(account);
        return true;
    }

    @Override
    public void deposit(String iban, BigDecimal amount)
            throws NegativeAmountException, AccountNotFoundException {

        try {
            Account account = accountDAO
                    .getByIban(iban)
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban=" + iban + " not found"));

            if (amount.compareTo(BigDecimal.ZERO) < 0) {
                throw new NegativeAmountException("Amount=" + amount + " must not be negative");
            }

            account.setBalance(account.getBalance().add(amount));
            accountDAO.saveOrUpdate(account);
            // logging
        } catch (NegativeAmountException | AccountNotFoundException e) {
            System.err.println(e.getMessage());     // logging
            throw e;
        }
    }

    @Override
    public void withdraw(String iban, BigDecimal amount)
            throws NegativeAmountException, AccountNotFoundException, InsufficientBalanceException {

        try {
            Account account = accountDAO
                    .getByIban(iban)
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban=" + iban + " not found"));

            if (amount.compareTo(BigDecimal.ZERO) < 0) {
                throw new NegativeAmountException("Amount=" + amount + " must not be negative");
            }

            if (account.getBalance().compareTo(amount) < 0) {
                throw new InsufficientBalanceException("Invalid amount=" + amount + " Amount must be less or equal to balance");
            }

            account.setBalance(account.getBalance().subtract(amount));
            accountDAO.saveOrUpdate(account);
        } catch (AccountNotFoundException | NegativeAmountException | InsufficientBalanceException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    @Override
    public BigDecimal getBalance(String iban) throws AccountNotFoundException {
        try {
            Account account = accountDAO
                    .getByIban(iban)
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban=" + iban + " not found"));
            return account.getBalance();
        } catch (AccountNotFoundException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    @Override
    public List<AccountReadOnlyDTO> getAllAccounts() {
        return accountDAO.getAccounts()
                .stream()
                .map(Mapper::mapToReadOnlyDTO)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isAccountExists(String iban) {
        return accountDAO.isAccountExists(iban);
    }
}
