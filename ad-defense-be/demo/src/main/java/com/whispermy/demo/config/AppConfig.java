package com.whispermy.demo.config;

import com.whispermy.demo.repository.AccessIpRepository;
import com.whispermy.demo.repository.ResourcesRepository;
import com.whispermy.demo.security.configs.MethodSecurityConfig;
import com.whispermy.demo.service.SecurityResourceService;
import com.whispermy.demo.service.impl.RoleHierarchyServiceImpl;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;

@Configuration
@AutoConfigureBefore({MethodSecurityConfig.class})
public class AppConfig {

   /* @Bean
    public SecurityResourceService securityResourceService(ResourcesRepository resourcesRepository*//*, RoleHierarchyImpl roleHierarchy*//*,RoleHierarchyServiceImpl roleHierarchyService, AccessIpRepository accessIpRepository*//*, MapBasedMethodSecurityMetadataSource mapBasedMethodSecurityMetadataSource, AnnotationConfigServletWebServerApplicationContext applicationContext, CustomMethodSecurityInterceptor methodSecurityInterceptor*//*) {
        SecurityResourceService SecurityResourceService = new SecurityResourceService(resourcesRepository, *//*roleHierarchy, *//*roleHierarchyService, accessIpRepository*//*, mapBasedMethodSecurityMetadataSource, applicationContext, methodSecurityInterceptor*//*);
        return SecurityResourceService;
    }*/

//    @Bean
//    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
//        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
//        return defaultAdvisorAutoProxyCreator;
//    }
}
