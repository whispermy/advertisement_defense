package com.whispermy.demo.security.init;

import com.whispermy.demo.service.SecurityResourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Slf4j
public class SecurityInitializer implements ApplicationRunner {

    @Autowired
    private SecurityResourceService securityResourceService;

    @Override
    @Transactional
    public void run(ApplicationArguments args) {

        securityResourceService.setRoleHierarchy();
    }
}
