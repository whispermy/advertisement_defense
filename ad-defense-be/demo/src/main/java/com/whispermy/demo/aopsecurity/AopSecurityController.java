package com.whispermy.demo.aopsecurity;

import com.whispermy.demo.aopsecurity.method.AopMethodService;
import com.whispermy.demo.security.aop.CustomMethodSecurityInterceptor;
import com.whispermy.demo.security.processor.ProtectPointcutPostProcessor;
import com.whispermy.demo.aopsecurity.pointcut.AopPointcutService;
import com.whispermy.demo.aopsecurity.liveaop.AopLiveMethodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.access.method.MapBasedMethodSecurityMetadataSource;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
@Slf4j
public class AopSecurityController {

   /* @Autowired
    private ProtectPointcutPostProcessor protectPoitcutPostProcessor;*/

    @Autowired
    MapBasedMethodSecurityMetadataSource mapBasedMethodSecurityMetadataSource;

    @Autowired
    private AopMethodService aopMethodService;

    @Autowired
    private AopPointcutService aopPointcutService;

    @Autowired
    private AopLiveMethodService aopLiveMethodService;

    @Autowired
    AnnotationConfigServletWebServerApplicationContext applicationContext;

    @Autowired
    CustomMethodSecurityInterceptor methodSecurityInterceptor;

    @GetMapping("/method")
    public String methodTest(){
        aopMethodService.methodTest();
        return "method";
    }

    @GetMapping("/method2")
    public String methodTest2(){
        log.debug(aopMethodService.getClass().getSimpleName());
        aopMethodService.methodTest2(aopMethodService);
        return "method2";
    }

    @GetMapping("/method3")
    public String methodTest3(){
        aopMethodService.methodTest3();
        return "method3";
    }

    @GetMapping("/aop1")
    public String aopFirstService(){
        aopPointcutService.aopService();
        return "aop1";
    }

    @GetMapping("/liveaop")
    public String liveAopService(){
        aopLiveMethodService.liveAopService();
        return "aop/liveaop";
    }

    @GetMapping("/addAop")
    public void addPointcut(String fullName, String roleName) throws Exception {

        String expression = "execution(* com.whispermy.demo.aopsecurity.liveaop.*Service.*(..))";
        List<ConfigAttribute> attr = Arrays.asList(new SecurityConfig("ROLE_MANAGER"));
        Map<String, List<ConfigAttribute>> pointcutMap = new LinkedHashMap<>();
        pointcutMap.put(expression,attr);
//        protectPoitcutPostProcessor.setPointcutMap(pointcutMap);

    }
}
