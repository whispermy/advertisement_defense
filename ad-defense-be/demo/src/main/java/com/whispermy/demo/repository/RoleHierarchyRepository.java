package com.whispermy.demo.repository;


import com.whispermy.demo.domain.entity.RoleHierarchy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleHierarchyRepository extends JpaRepository<RoleHierarchy, Long> {

    RoleHierarchy findByChildName(String roleName);
}
