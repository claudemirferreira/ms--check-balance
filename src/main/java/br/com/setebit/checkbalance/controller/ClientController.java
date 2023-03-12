package br.com.setebit.checkbalance.controller;

import br.com.setebit.checkbalance.model.Client;
import br.com.setebit.checkbalance.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    ClientService clienteService;

    @GetMapping
    public ResponseEntity<List<Client>> findAll(){
        List<Client> list = clienteService.findAll();
        return new ResponseEntity<>( list, HttpStatus.OK);
    }

}
