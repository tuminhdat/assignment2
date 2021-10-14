package com.csis3275.controller_computingcooker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csis3275.model_computingcooker.model_oal_06;

@Controller	
public class assignment2_controller {
	@RequestMapping("/")
	public String firstPage() {
		return "index";
	}
	
	@RequestMapping("/Omarinfo/")
	public String format(model_oal_06 omar, ModelMap model) {
		model.addAttribute("mypath", omar.getPath());
		return "aboutOmar";
	}
}
