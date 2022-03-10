package com.francisps103.minildap.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.francisps103.lib.shared.CommonUtils;

@Controller
public class MainController {
	@GetMapping ("")
	public String getHomePage(Model model) {
		String appName=CommonUtils.getAppName();
		model.addAttribute("appname",appName);
		return "index";
	}

}
