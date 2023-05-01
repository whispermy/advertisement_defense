package com.whispermy.demo.service;

import com.whispermy.demo.domain.dto.UserDto;
import com.whispermy.demo.domain.entity.Account;

import java.util.List;

public interface UserService {

  List<Account> getUsers();
  UserDto getUser(Long id);
  void createUser(Account account);
  void deleteUser(Long idx);
}
