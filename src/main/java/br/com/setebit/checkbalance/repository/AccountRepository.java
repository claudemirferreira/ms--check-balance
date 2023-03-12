package br.com.setebit.checkbalance.repository;

import br.com.setebit.checkbalance.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
