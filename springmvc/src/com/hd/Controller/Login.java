package com.hd.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sysAdmin")
public class Login {
	@RequestMapping("/AdminLogin")
	public String firstpage(){
		return "firstpage";
	}
}
