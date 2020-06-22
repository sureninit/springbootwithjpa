package com.learningSpringBootWithJpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// uploded in github
@Controller
//@RestController
public class MainController {
	
	@RequestMapping(value="/index")
	private String indexPage() {
		System.out.println("This is controller");
		return "index";
	}

}
