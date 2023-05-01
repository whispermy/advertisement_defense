package com.whispermy.demo.security.authentication.services;

import com.whispermy.demo.domain.entity.Account;
import lombok.Data;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class UserDetail extends org.springframework.security.core.userdetails.User {
  private Account account;
  private List<String> roles;

  public UserDetail(Account account, List<String> roles) {
    super(account.getUsername(), account.getPassword(), roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
    this.account = account;
    this.roles = roles;
  }
}
