package com.bank.accounts.data.controllers;

import com.bank.accounts.data.models.UserRequestModel;
import com.bank.accounts.domain.entities.User;
import com.bank.accounts.repository.BankAccountRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank-account")
public class BankAccountController {

    private final BankAccountRepository bankAccountRepository;

    public BankAccountController(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    @PostMapping("/account-register")
    @ResponseStatus(HttpStatus.OK)
    public void createBankAccount(@Valid @RequestBody UserRequestModel request) {
        bankAccountRepository.save(new User(request));
    }
}