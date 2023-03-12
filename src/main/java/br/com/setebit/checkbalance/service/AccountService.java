package br.com.setebit.checkbalance.service;

import br.com.setebit.checkbalance.exception.NotFoundExcetipon;
import br.com.setebit.checkbalance.model.Account;
import br.com.setebit.checkbalance.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public boolean hasBalance(Long id, float valor) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new NotFoundExcetipon("not found " + id));
        return account.getBalance() >= valor;
    }
}
