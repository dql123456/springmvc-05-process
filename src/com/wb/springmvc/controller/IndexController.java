package com.wb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	public static final String SUCCESS = "success";
	
	@RequestMapping("/testProcess")
	public String testProcess() {
		System.out.println("testProcess");
		return SUCCESS;
	}
	
}
