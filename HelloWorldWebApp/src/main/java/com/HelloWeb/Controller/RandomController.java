package com.HelloWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RandomController {
	
	@RequestMapping("/randomURL")
	public String returnRandomMessage(){
			return ("randomview");
	}

}
