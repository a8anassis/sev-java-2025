package gr.aueb.sev.bankapp.controller;

import gr.aueb.sev.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.sev.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.sev.bankapp.core.exceptions.ValidationException;
import gr.aueb.sev.bankapp.dto.AccountDepositDTO;
import gr.aueb.sev.bankapp.dto.AccountInsertDTO;
import gr.aueb.sev.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.sev.bankapp.dto.AccountWithdrawDTO;
import gr.aueb.sev.bankapp.model.Account;
import gr.aueb.sev.bankapp.service.IAccountService;
import gr.aueb.sev.bankapp.validation.Validator;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class AccountController {
    private final IAccountService accountService;

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance)
            throws ValidationException {

        AccountReadOnlyDTO accountReadOnlyDTO;
        AccountInsertDTO accountInsertDTO = new AccountInsertDTO(iban, balance);


        // Validation
        Map<String, String> errors;
        errors = Validator.validateInsertDTO(accountInsertDTO);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        // Call service
        accountReadOnlyDTO = accountService.createNewAccount(accountInsertDTO);
        return accountReadOnlyDTO;
    }

    public void deposit(String iban, BigDecimal amount)
            throws AccountNotFoundException, ValidationException {

        AccountDepositDTO accountDepositDTO = new AccountDepositDTO(iban, amount);

        // Validation
        Map<String, String> errors;
        errors = Validator.validateDepositDTO(accountDepositDTO);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        accountService.deposit(accountDepositDTO);
    }

    public void withdraw(String iban, BigDecimal amount)
            throws AccountNotFoundException, ValidationException, InsufficientBalanceException {

        AccountWithdrawDTO withdrawDTO = new AccountWithdrawDTO(iban, amount);

        // Validation
        Map<String, String> errors;
        errors = Validator.validateWithdrawDTO(withdrawDTO);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        // Call service
        accountService.withdraw(withdrawDTO);
    }

    public BigDecimal getBalance(String iban) throws AccountNotFoundException {
        return accountService.getBalance(iban);
    }

    public List<AccountReadOnlyDTO> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    public int getCount() {
        return accountService.getCount();
    }

    public boolean isAccountExists(String iban) {
        return accountService.isAccountExists(iban);
    }
}
