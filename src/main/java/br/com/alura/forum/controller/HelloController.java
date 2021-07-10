package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	int counter = 0;
	@RequestMapping("/")
	@ResponseBody
	public String helloWorld() {
		
		System.out.println("Passei pelo controller " + counter++);
		return "Hello World!";
		
	}
}
