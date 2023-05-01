package com.whispermy.demo.service;

import com.whispermy.demo.domain.dto.RoleDto;
import com.whispermy.demo.domain.entity.Role;

import java.util.List;

public interface RoleService {

    Role getRole(long id);

    List<Role> getRoles();

    void createRole(Role role);
}