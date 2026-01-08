package gr.aueb.sev.bankapp.controller;

import gr.aueb.sev.bankapp.core.exceptions.ValidationException;
import gr.aueb.sev.bankapp.dto.AccountInsertDTO;
import gr.aueb.sev.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.sev.bankapp.model.Account;
import gr.aueb.sev.bankapp.service.IAccountService;
import gr.aueb.sev.bankapp.validation.Validator;

import java.math.BigDecimal;
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
}
