package com.whispermy.demo.controller.login;


import com.whispermy.demo.service.RoleService;
import com.whispermy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;
	
	@GetMapping(value="/denied")
	public String accessDenied() throws Exception {

		return "user/login/denied";
	}
}
