package com.hd.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hd.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	String a ="a";
	@Autowired
	private UserService userService;
 
	@RequestMapping(value = "save")
	public String save(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + " " + password);
		System.out.println("controller save...");
 
		userService.save();
		return "success";
	}
}
