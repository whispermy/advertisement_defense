package com.whispermy.demo.repository;

import com.whispermy.demo.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Account, Long> {

  Account findByUsername(String username);

  int countByUsername(String username);

  @Override
  void delete(Account account);

}