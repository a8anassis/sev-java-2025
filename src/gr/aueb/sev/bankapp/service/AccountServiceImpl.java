package gr.aueb.sev.bankapp.service;

import gr.aueb.sev.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.sev.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.sev.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.sev.bankapp.core.mapper.Mapper;
import gr.aueb.sev.bankapp.dao.IAccountDAO;
import gr.aueb.sev.bankapp.dto.AccountDepositDTO;
import gr.aueb.sev.bankapp.dto.AccountInsertDTO;
import gr.aueb.sev.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.sev.bankapp.dto.AccountWithdrawDTO;
import gr.aueb.sev.bankapp.model.Account;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class AccountServiceImpl implements IAccountService {
    private final IAccountDAO accountDAO;       // Dependencies

    public AccountServiceImpl(IAccountDAO accountDAO) {         // Dependency Injection
        this.accountDAO = accountDAO;
    }

    @Override
    public AccountReadOnlyDTO createNewAccount(AccountInsertDTO accountInsertDTO) {
        Account account = Mapper.mapToModelEntity(accountInsertDTO);
        accountDAO.saveOrUpdate(account);
        return Mapper.mapToReadOnlyDTO(account);
    }

    @Override
    public void deposit(AccountDepositDTO depositDTO)
            throws AccountNotFoundException {

        try {
            Account account = accountDAO.getByIban(depositDTO.iban())
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban=" + depositDTO.iban() + " not found"));

//            if (amount.compareTo(BigDecimal.ZERO) < 0) {
//                throw new NegativeAmountException("Amount=" + amount + " must not be negative");
//            }

            account.setBalance(account.getBalance().add(depositDTO.amount()));
            accountDAO.saveOrUpdate(account);
            // logging
        } catch (AccountNotFoundException e) {
            System.err.println(e.getMessage());     // logging
            throw e;
        }
    }

    @Override
    public void withdraw(AccountWithdrawDTO withdrawDTO)
            throws AccountNotFoundException, InsufficientBalanceException {

        try {
            Account account = accountDAO
                    .getByIban(withdrawDTO.iban())
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban=" + withdrawDTO.iban() + " not found"));

//            if (amount.compareTo(BigDecimal.ZERO) < 0) {
//                throw new NegativeAmountException("Amount=" + amount + " must not be negative");
//            }

            if (account.getBalance().compareTo(withdrawDTO.amount()) < 0) {
                throw new InsufficientBalanceException("Invalid amount=" + withdrawDTO.amount() + " Amount must be less or equal to balance");
            }

            account.setBalance(account.getBalance().subtract(withdrawDTO.amount()));
            accountDAO.saveOrUpdate(account);
        } catch (AccountNotFoundException | InsufficientBalanceException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    @Override
    public BigDecimal getBalance(String iban) throws AccountNotFoundException {
        try {
            Account account = accountDAO.getByIban(iban)
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
                .toList();  // unmodifiable list
    }

    @Override
    public int getCount() {
        return accountDAO.count();
    }

    @Override
    public boolean isAccountExists(String iban) {
        return accountDAO.isAccountExists(iban);
    }
}
