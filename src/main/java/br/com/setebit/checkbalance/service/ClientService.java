package br.com.setebit.checkbalance.service;

import br.com.setebit.checkbalance.model.Client;
import br.com.setebit.checkbalance.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clienteRepository;

    public List<Client> findAll(){
        return clienteRepository.findAll();
    }
}
