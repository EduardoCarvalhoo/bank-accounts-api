package com.bank.accounts.repository;

import com.bank.accounts.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<User, Long> {
}
