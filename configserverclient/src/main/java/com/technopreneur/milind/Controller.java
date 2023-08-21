package com.technopreneur.milind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Controller {
	
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/message")
	public String getMessage() {
		return messageService.getMessage();
	}

}
