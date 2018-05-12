package org.techhunt.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.techhunt.rest.domain.Message;

@RestController
public class HelloRestController {
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to RestTemplate Example.";
	}
	
	@RequestMapping("/hello/{player}")
	public Message message(@PathVariable String player) {
		Message message= new Message(player, "Hello"+ player);
		return message;
	}
}
