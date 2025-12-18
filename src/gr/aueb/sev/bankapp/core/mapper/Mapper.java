package gr.aueb.sev.bankapp.core.mapper;

import gr.aueb.sev.bankapp.dto.AccountInsertDTO;
import gr.aueb.sev.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.sev.bankapp.model.Account;

public class Mapper {

    /**
     * No instances of this class should be available.
     */
    private Mapper() {
    }

    public static Account mapToModelEntity(AccountInsertDTO accountInsertDTO) {
        return new Account(accountInsertDTO.getIban(), accountInsertDTO.getBalance());
    }

    public static AccountReadOnlyDTO mapToReadOnlyDTO(Account account) {
        return new AccountReadOnlyDTO(account.getIban(), account.getBalance());
    }
}
