package br.com.setebit.checkbalance.controller;

import br.com.setebit.checkbalance.model.Client;
import br.com.setebit.checkbalance.service.AccountService;
import br.com.setebit.checkbalance.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("account/")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("{id}/{balance}")
    public ResponseEntity<Boolean> findAll(@PathVariable("id") Long id,
                                           @PathVariable("balance") float balance){
        log.info("id {}", id);
        log.info("balance {}", balance);
        boolean result = accountService.hasBalance(id, balance);
        log.info("result {}", result);
        return new ResponseEntity<Boolean>( result, HttpStatus.OK);
    }

}
