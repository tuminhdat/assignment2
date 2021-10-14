package com.csis3275.controller_computingcooker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csis3275.model_computingcooker.model_dtu_90;
import com.csis3275.model_computingcooker.model_oal_06;
import com.csis3275.model_computingcooker.model_ttr_01;

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
	
	@RequestMapping("/Davidinfo/")
	public String format(model_dtu_90 david, ModelMap model) {
		model.addAttribute("mypath", david.getPath());
		return "aboutdavid";
	}
	
	@RequestMapping("/Marcoinfo/")
	public String format(model_ttr_01 marco, ModelMap model) {
		model.addAttribute("mypath", marco.getPath());
		return "aboutTriDucTran";
	}
}
