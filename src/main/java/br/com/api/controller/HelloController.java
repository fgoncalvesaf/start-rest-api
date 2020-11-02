package br.com.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@GetMapping
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok().body("Hello World");
	}

}
