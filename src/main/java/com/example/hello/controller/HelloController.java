package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@value("${saludo}")
	private String saludo;
	
	@GetMapping("/hello")
	public String getHello(Model model) {
		model.addAttribute("msg", saludo);
		return "msg";
	}
}
