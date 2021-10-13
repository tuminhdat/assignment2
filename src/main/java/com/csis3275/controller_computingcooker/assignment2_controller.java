package com.csis3275.controller_computingcooker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class assignment2_controller {
	@RequestMapping("/")
	public String firstPage() {
		return "index";
	}
}
