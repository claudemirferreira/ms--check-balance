package br.com.setebit.checkbalance.repository;

import br.com.setebit.checkbalance.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
