package com.web.jy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class mainController {
	@RequestMapping("/")
	public String jspCheck(Model model) {
		System.out.println("********44444444444***********");
		model.addAttribute("name","name¿‘¥œ¥Ÿ");
		return "main";
	}

}
