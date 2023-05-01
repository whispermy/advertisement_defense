package com.whispermy.demo.domain.dto;

import com.whispermy.demo.domain.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String username;
    private String email;
    private int age;
    private String password;
    private List<String> roles;
}


