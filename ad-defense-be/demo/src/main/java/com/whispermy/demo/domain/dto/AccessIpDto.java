package com.whispermy.demo.domain.dto;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccessIpDto{

    private Long id;
    private String ipAddress;

}
