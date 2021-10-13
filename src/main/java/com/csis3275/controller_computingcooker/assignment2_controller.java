package com.csis3275.controller_computingcooker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csis3275.model_computingcooker.model_dtu_90;

@Controller	
public class assignment2_controller {
	
	@RequestMapping("/")
	public String firstPage() {
		return "index";
	}
	
	@RequestMapping("/davidinfo/")
	public String calBikeFee(model_dtu_90 david, ModelMap model) {
		model.addAttribute("mypath", david.getPath());
		return "aboutdavid";
	}
}
