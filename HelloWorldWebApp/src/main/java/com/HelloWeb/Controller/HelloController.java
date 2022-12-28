package com.HelloWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	//adding the request mapping..
	
	@RequestMapping("/")
	public String giveWelcomeMessage() {
		return "welcome";
	}
	
	@RequestMapping("/hello")
	public String giveHelloMessage() {
		return "hello";
	}
		
		@RequestMapping("/goodbye")
		public String givegoodbyeMessage() {
			return "goodbye";
		
	}

}
